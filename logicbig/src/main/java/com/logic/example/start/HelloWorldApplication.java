package com.logic.example.start;

import com.logic.example.bean.MyBean;
import com.logic.example.bean.StaticMyBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.logic.example")
public class HelloWorldApplication {
    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
    @Bean
    public StaticMyBean staticMyBean(){
        return new StaticMyBean();
    }
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(HelloWorldApplication.class);
        MyBean bean  = context.getBean(MyBean.class);
        StaticMyBean staticMyBean = context.getBean(StaticMyBean.class);
        System.out.println(bean.doSomething());
        System.out.println(staticMyBean.staticdoSmething());

    }

}

