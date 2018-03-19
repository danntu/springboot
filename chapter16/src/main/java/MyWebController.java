import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyWebController {

    @Autowired
    private MyBean myBean;

    @RequestMapping("/")

    public String index(){
        return "Name is "+ myBean.getName()+" Surname is"+
                myBean.getSurname()+" Age "+myBean.getAge();
    }
}
