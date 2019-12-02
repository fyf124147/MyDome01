package com.zking.fyf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tt")
public class IndexController {
    @RequestMapping("/s")
    public String toIndex(){
        return "index";

    }
    @RequestMapping("/")
    public String aa(){
        return "fyf";
    }
}
