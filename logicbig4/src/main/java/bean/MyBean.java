package bean;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
    public String getMessage(){
        return "Example using @SpringBootApplication";
    }
}
