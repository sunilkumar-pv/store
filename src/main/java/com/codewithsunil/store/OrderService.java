package com.codewithsunil.store;

public class OrderService {
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    private PaymentService paymentService;

//    public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public  void placeOrder(){
//        var paymentService = new StripePaymentService();
//        paymentService.porcesPayment(10);
        paymentService.porcesPayment(10);
    }

}
