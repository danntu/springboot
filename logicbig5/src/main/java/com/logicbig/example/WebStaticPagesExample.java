package com.logicbig.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class WebStaticPagesExample {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WebStaticPagesExample.class);
        app.run(args);
    }
}
