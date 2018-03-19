package kz.danntu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "kz.danntu.domain")
@SpringBootApplication
@RestController


public class Application {
    @RequestMapping("/")
    String hello(){
        return "<b>Hello world and people</b>";
        String n;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
