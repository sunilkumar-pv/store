package com.codewithsunil.store;

import org.springframework.stereotype.Service;

//@Service("paypal")
public class PayPalPaymentService implements PaymentService {
    @Override
    public void porcesPayment(double amount) {
        System.out.println("PayPal");
        System.out.println("Amount " + amount);
    }
}
