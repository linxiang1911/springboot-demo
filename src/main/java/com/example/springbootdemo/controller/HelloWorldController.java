package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }
    @ResponseBody
    @RequestMapping("/haha")
    public String haha(){
        return "hhhhhhhhhhhhh";
    }
}
