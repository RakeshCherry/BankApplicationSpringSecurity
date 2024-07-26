package com.springsecurity.section1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeCotroller {

    @GetMapping("/welcome")
    public String sayWelcome(){
        return "Welcome to Spring Application with security";
    }
}
