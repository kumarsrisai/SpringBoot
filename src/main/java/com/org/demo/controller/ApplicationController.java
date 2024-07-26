package com.org.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("hello")
    public String greet(HttpServletRequest request){
        return "HELLO WORLD " +request.getSession().getId();
    }

    @GetMapping("hi")
    public String hi(HttpServletRequest request){
        return "HEy" +request.getSession().getId();
    }
}
