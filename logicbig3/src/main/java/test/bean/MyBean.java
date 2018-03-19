package test.bean;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
    public String getMessage(){
        return "a message from MyBean @EnableAutoConfiguration";
    }
}
