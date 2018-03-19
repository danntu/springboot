import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = {"bean","controller"})

public class EnableAutoConfigExample {
    public static void main(String[] args) {
        SpringApplication.run(EnableAutoConfigExample.class,args);
    }
}
