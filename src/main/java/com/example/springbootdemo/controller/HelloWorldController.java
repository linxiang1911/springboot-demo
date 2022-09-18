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
    @RequestMapping("/mmmmmmmmmm")
    public String haha(){
        return "ddddddddddd";
    }
    @ResponseBody
    @RequestMapping("/sisissi")
    public String xuexuexue(){
        return "yueyueyue";
    }
    @ResponseBody
    @RequestMapping("/feature")
    public String feature(){
        return "这是feature的内容";
    }
}
