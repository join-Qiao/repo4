package com.itcast.spring_boot_demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/getDate")
    public String getDate(){
        return "success";
    }

    public void getNum(){
        return;
    }
}
