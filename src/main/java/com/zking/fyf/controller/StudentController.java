package com.zking.fyf.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.zking.fyf.model.Student;
import com.zking.fyf.service.IStudentService;
import com.zking.fyf.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private IStudentService studentService;
    @ModelAttribute
    public void init(Model model){
        System.out.println("init...");
        String[] classNmaes = {"T230","T220","T229"};
        model.addAttribute("classNames",classNmaes);

        //给springmc的from标签提供数据，用于绑值
        Student student = new Student();
        model.addAttribute("student",student);
    }

    @RequestMapping("/toAdd")
    public String toAdd(Model model){
        System.out.println("toAdd");
        return "addStudent";
    }
    @RequestMapping("/toEdit")
    public String editStudent(Model model,Student student){
        System.out.println("edit");
        Student s = studentService.load(student);
        model.addAttribute("student",s);

        return "editStudent";
    }

    @RequestMapping("/add")
    public String addStudeng(Model model, @Validated(Student.ValidateGroups.Add.class) Student student, BindingResult bindingResult ){
        System.out.println(student);
        //服务器端校验不通过
        if(bindingResult.hasErrors()){
            System.out.println("服务器端校验不通过");
            return "addStudent"  ;
        }else{
            System.out.println("服务器端校验通过");
            studentService.add(student);
            System.out.println("新增");
            model.addAttribute("message","学生新增成功");
            return  "index";
        }

    }


    @RequestMapping("/edit")
    public String editStudeng(Model model, @Validated(Student.ValidateGroups.Edit.class) Student student, BindingResult bindingResult ){
        System.out.println(student);
        //服务器端校验不通过
        if(bindingResult.hasErrors()){
            System.out.println("服务器端校验不通过");
            return "editStudent"  ;
        }else{
            System.out.println("服务器端校验通过");
            studentService.edit(student);
            System.out.println("修改");
            model.addAttribute("message","学生修改成功");
            return  "index";
        }

    }
    @RequestMapping("/load")
    @ResponseBody
public  JsonData load(Student student){
    System.out.println("load");
        Student s = studentService.load(student);
        JsonData jsonData= new JsonData();
        jsonData.setResult(s);
        return  jsonData;
}

}
   