package com.zking.fyf.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

@Controller
public class UploadController {

String saveDir="D:\\book\\temp\\lib";

    @RequestMapping("/toUpload")
    public  String toUpload(){
        return  "fileload";
    }
    @RequestMapping("/upload")
    public String upload(MultipartFile img) throws  Exception{
        String path= saveDir + File.separator+System.currentTimeMillis()+".jpg";
        System.out.println(path);
        File file = new File(path);//window
        img.transferTo(file);

        return "redirect:/toUpload";
    }

    @RequestMapping("/uploads")
    public String uploads(MultipartFile[] imgs) throws  Exception{
        for(int i =0;null!=imgs && i<imgs.length;i++){
            String path= saveDir + File.separator+System.currentTimeMillis()+".jpg";
            System.out.println(path);
            File file = new File(path);//window
            imgs[i].transferTo(file);
        }
        return "redirect:/toUpload";
    }

//    @RequestMapping("download")
////    public ResponseEntity<byte[]> download(){
////        String fileName = "测评编程题.doc";
////        byte[] fileByte=null;
////        try {
////            String  dFileName = new String(fileName.getBytes("UTF-8"),"ISO-8859-1");
////            HttpHeaders header = new HttpHeaders();
////            header.setContentType(MediaType.APPLICATION_OCTET_STREAM);
////            header.setContentDispositionFormData("attachment", dFileName);
////            fileByte = FileUtils.readFileToByteArray(new File("d:/"+fileName));
////            return new ResponseEntity<byte[]>(fileByte,header, HttpStatus.CREATED);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        return null;
////    }
    /**
     * 文件下载
     */
    @Autowired
    private ServletContext context;
    @RequestMapping("/download")
    public ModelAndView download(String name, HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("文件下载" );
        //GET请求中文件名为中文时乱码处理
        name=new String(name.getBytes("ISO-8859-1"),"UTF-8");
        //设置响应头为下载文件，而不是直接打开
        response.setContentType("application/x-msdownload");
        //获取代理服务器信息，因为IE和其他浏览器的修改响应头的中文格式的方式不同
        String userAgent=request.getHeader("User-Agent");
        if(userAgent.contains("IE")){
            response.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(name,"UTF-8"));
        }else{
            response.setHeader("Content-Disposition","attachment;filename="+new String(name.getBytes("UTF-8"),"ISO-8859-1"));
        }
        //把文件对象,以流的方式写出到images的文件夹中
        String realpath = context.getRealPath("/images");
        Files.copy(Paths.get(realpath,name),response.getOutputStream());
        return null;
    }

}
