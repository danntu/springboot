package com.logicbig.example;

import org.springframework.boot.Banner;
import org.springframework.boot.ImageBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;

public class CustomizeBootExample {
    public static void main(String[] args) throws MalformedURLException{
        SpringApplication app = new SpringApplication(CustomizeBootExample.class);

        app.setLogStartupInfo(false);
        //app.setBannerMode(Banner.Mode.OFF);
//        UrlResource r = new UrlResource("https://www.logicbig.com/tutorials/spring-framework/spring-boot/images/spring-boot.png");
//        app.setBanner(new ImageBanner(r));
        app.run(args);
    }
}
