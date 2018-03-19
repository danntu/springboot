package com.logic.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheController {
    @RequestMapping("/rest")
    public String handle(){
        return "message from rest handler";
    }
}
