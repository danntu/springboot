package com.logic.example.controller;

import com.logic.example.bean.MyBean;
import com.logic.example.bean.StaticMyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @Autowired
    MyBean myBean;
    @Autowired
    StaticMyBean staticMyBean;
    @RequestMapping("/")
    @ResponseBody
    public String helloHandler(){
        return "<h1>Hello World!</h1>"+
                "<br>"+myBean.doSomething()+"" +
                "<br>"+staticMyBean.staticdoSmething();
    }
}
