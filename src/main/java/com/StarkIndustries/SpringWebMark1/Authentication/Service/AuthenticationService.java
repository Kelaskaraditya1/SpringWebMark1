package com.StarkIndustries.SpringWebMark1.Authentication.Service;

import com.StarkIndustries.SpringWebMark1.Authentication.Repository.AuthenticationRepository;
import com.StarkIndustries.SpringWebMark1.Authentication.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private AuthenticationRepository authenticationRepository;

    public boolean loginUser(User user){
        if(authenticationRepository.existsById(user.getUsername()))
            return true;
        return false;
    }

    public boolean signup(User user){
        if(!authenticationRepository.existsById(user.getUsername())){
            authenticationRepository.save(user);
            return true;
        }
        else
            return false;
    }
}
