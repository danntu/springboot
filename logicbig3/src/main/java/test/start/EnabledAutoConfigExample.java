package test.start;

import test.bean.MyBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = {"test.controller","test.bean"})
//@ComponentScan(basePackageClasses = {MyBean.class,MyWebController.class})
@EnableAutoConfiguration
public class EnabledAutoConfigExample {
    public static void main(String[] args) {
        SpringApplication.run(EnabledAutoConfigExample.class);
    }
}
