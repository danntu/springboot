import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {
    @RequestMapping("/")
    String home(){
        int year_of_birth = 1986;
        return "Hello Danik with hello <b>devtools </b> "+year_of_birth;
    }

    @RequestMapping("/home")
    String home2(){
        int year_of_birth = 1986;
        return "Hello Danik with hello 2 <b>devtools </b> "+year_of_birth;
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class);
    }
}
