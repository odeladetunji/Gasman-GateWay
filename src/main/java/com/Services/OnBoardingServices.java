package com.Services;

import com.models.Authentication;
import com.models.Distributors;
import com.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class OnBoardingServices implements OnboardingInterface {
    HttpHeaders headers = new HttpHeaders();
    HttpEntity<Authentication> entity;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public void setMetadata(){
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        entity = new HttpEntity<>(headers);
    }

    @Override
    public String Login(Authentication payload){
        HttpEntity<Authentication> entity = new HttpEntity<>(payload);
        return restTemplate.postForObject("localhost:8085/Gasman/Login", entity, String.class);
      //  return restTemplate.exchange("localhost:8085/Gasman/Login", HttpMethod.POST, entity, String.class).getBody();
    }

    @Override
    public String SignUp(Authentication payload){
        HttpEntity<Authentication> entity = new HttpEntity<>(payload);
        return restTemplate.postForObject("localhost:8085/Gasman/Signup", entity, String.class);
        //return restTemplate.exchange("localhost:8085/Gasman/Signup", HttpMethod.POST, entity, String.class).getBody();
    }

    @Override
    public String userRegistration(User payload){
        HttpEntity<User> entity = new HttpEntity<>(payload);
        return restTemplate.postForObject("localhost:8085/Gasman/createUser", entity, String.class);
        //return restTemplate.exchange("localhost:8085/Gasman/createUser", HttpMethod.POST, entity, String.class).getBody();
    }

    @Override
    public String distributorRegistration(Distributors payload){
        HttpEntity<Distributors> entity = new HttpEntity<>(payload);
        return restTemplate.postForObject("localhost:8085/Gasman/createDistributor", entity, String.class);
       // return restTemplate.exchange("localhost:8085/Gasman/createDistributor", HttpMethod.POST, entity, String.class).getBody();
    }
}
