package com.chinmay.azureDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DemoController {

    @GetMapping("/test")
    public String testAzure(){
        return "HELLO USER";
    }
}
