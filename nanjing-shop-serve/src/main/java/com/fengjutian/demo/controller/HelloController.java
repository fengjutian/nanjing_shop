package com.fengjutian.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("demo")
    public String demo() {
        return "demo";
    }
}