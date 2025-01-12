package com.StarkIndustries.SpringWebMark1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String indexPage(){
        return "Welcome!!!";
    }

    @RequestMapping("/home")
    public String homePage(){
        return "This is home page";
    }
}
