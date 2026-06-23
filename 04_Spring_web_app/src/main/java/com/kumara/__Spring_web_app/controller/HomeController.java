package com.kumara.__Spring_web_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HomeController {
    @RequestMapping("/")
    public String greeet(){
        return "Welcome to the backend world";
    }
}
