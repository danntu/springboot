package test.controller;

import test.bean.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyWebController {
    @Autowired
    private MyBean myBean;

    @RequestMapping("/")
    @ResponseBody
    public String theHadler(){
        return myBean.getMessage();
    }
}
