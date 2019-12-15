package com.Services;

import com.models.Authentication;
import com.models.Orders;
import com.models.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServices implements OrderInterfaces {
    HttpHeaders headers = new HttpHeaders();
    HttpEntity<Authentication> entity;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String makePayment(Payment payload){
        return restTemplate.exchange("localhost:8087/Gasman/makePayment", HttpMethod.POST, entity, String.class).getBody();
    }

    @Override
    public String cancellOrder(Long id){
        return restTemplate.exchange("localhost:8087/Gasman/cancellOrder", HttpMethod.POST, entity, String.class).getBody();
    }

    @Override
    public String placeOrder(Orders payload){
        return restTemplate.exchange("localhost:8087/Gasman/placeOrder", HttpMethod.POST, entity, String.class).getBody();
    }

}




