package com.fengjutian.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController(){

    @GetMapping("demo")
    public String demo(){

        return "demo";
    }

}