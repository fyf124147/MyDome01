package com.zking.fyf.controller;

import com.zking.fyf.model.Student;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/test")
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name, HttpServletRequest request){
        System.out.println("hello..ts+"+name+"="+System.currentTimeMillis());
       request.setAttribute("name",name);
        return  "redirect:/test/toMain";
    }

    @RequestMapping("/toMain")
    public String toMain(){
        return "main";
    }

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
    System.out.println("aaaaa");
    System.out.println("toAdd");
    return "addStudent";
}

    @RequestMapping("/add")
    public String addStudeng(HttpServletRequest request){
        System.out.println("新增");
        return  null;
    }
}
