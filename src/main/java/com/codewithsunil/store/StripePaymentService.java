package com.codewithsunil.store;

public class StripePaymentService implements PaymentService {
    @Override
    public void porcesPayment(double amount) {
        System.out.println("Stripe");
        System.out.println("Amount " + amount);

    }
}
