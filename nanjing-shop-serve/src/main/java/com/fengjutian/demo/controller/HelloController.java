package com.fengjutian.demo.controller;

import org.springframework.stereotype.Controller;

@RestController
public class HelloController() {

    @GetMapping("demo")
    public String demo(){

        return "demo";
    }

}