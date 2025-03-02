package com.codewithsunil.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    private PaymentService paymentService;

    @PostConstruct
    public  void init(){
        System.out.println("OdrderService is post construct");
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("OdrderService is pre destroy");
    }

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService created");
    }

    public  void placeOrder(){
        paymentService.porcesPayment(10);
    }

}
