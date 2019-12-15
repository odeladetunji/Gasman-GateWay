package com.Controllers;

import com.Services.OnboardingInterface;
import com.models.Authentication;
import com.models.Distributors;
import com.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class OnBoardingController {

    @Autowired
    OnboardingInterface onboardingInterface;

    @Autowired
    RestTemplate restTemplate;

    @ResponseBody
    @GetMapping(path = "/ping")
    public StringBuilder ping(){
        StringBuilder aString = new StringBuilder();
        aString.append("Server is Ok");

        return aString;
    }

    @ResponseBody
    @PostMapping(path = "/Gasman/Login")
    public String Login(@RequestBody Authentication payload){
        return onboardingInterface.Login(payload);
    }

    @ResponseBody
    @PostMapping(path = "/Gasman/Signup")
    public String signUp(@RequestBody Authentication payload){
        return onboardingInterface.SignUp(payload);
    }

    @ResponseBody
    @PostMapping(path = "/Gasman/createDistributor")
    public String distributorRegistration(@RequestBody Distributors payload){
        return onboardingInterface.distributorRegistration(payload);
    }

    @ResponseBody
    @PostMapping(path = "/Gasman/createUser")
    public String userRegistration(@RequestBody User payload){
        return onboardingInterface.userRegistration(payload);
    }

}






























