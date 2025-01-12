package com.StarkIndustries.SpringWebMark1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @RequestMapping("/login")
    public String loginPage(){
        return "Login Successfully";
    }
}
