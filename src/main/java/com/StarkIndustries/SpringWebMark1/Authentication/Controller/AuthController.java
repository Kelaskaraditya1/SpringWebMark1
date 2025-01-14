package com.StarkIndustries.SpringWebMark1.Authentication.Controller;

import com.StarkIndustries.SpringWebMark1.Authentication.Service.AuthenticationService;
import com.StarkIndustries.SpringWebMark1.Authentication.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/login")
    public  String loginPage(@RequestBody User user){
        if(authenticationService.loginUser(user))
            return "Login Successfully!!";
        return "Failed to Login!!";
    }

    @PostMapping("/signup")
    public String signupPage(@RequestBody User user){
        if(authenticationService.signup(user))
            return "User added Successfully!!";
        else
            return "User already exist!!";
    }
}
