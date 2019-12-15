package com.Controllers;

import com.Services.OrderInterfaces;
import com.models.Orders;
import com.models.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderInterfaces orderInterfaces;

    @ResponseBody
    @PostMapping(path = "/Gasman/placeOrder")
    public String placeOrder(@RequestBody Orders payload){
        return orderInterfaces.placeOrder(payload);
    }

    @ResponseBody
    @GetMapping(path = "/Gasman/cancellOrder")
    public String cancellOrder(@RequestAttribute("Id") Long id){
        return orderInterfaces.cancellOrder(id);
    }

    @ResponseBody
    @PostMapping(path = "/Gasman/makePayment")
    public String makePayment(@RequestBody Payment payload){
        return orderInterfaces.makePayment(payload);
    }

}
