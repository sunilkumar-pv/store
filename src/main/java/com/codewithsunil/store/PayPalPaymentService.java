package com.codewithsunil.store;

public class PayPalPaymentService implements PaymentService {
    @Override
    public void porcesPayment(double amount) {
        System.out.println("PayPal");
        System.out.println("Amount " + amount);
    }
}
