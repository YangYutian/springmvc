package com.hxyl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hellos")
public class HelloWorld {
    @ResponseBody
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String hello(){
        System.out.println("hello world.");
        return "success";
    }
}
