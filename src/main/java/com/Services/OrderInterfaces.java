package com.Services;

import com.models.Orders;
import com.models.Payment;

public interface OrderInterfaces {
    String makePayment(Payment payload);
    String cancellOrder(Long id);
    String placeOrder(Orders payload);
}
