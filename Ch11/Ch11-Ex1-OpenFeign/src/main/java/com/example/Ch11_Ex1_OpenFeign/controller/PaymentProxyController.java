package com.example.Ch11_Ex1_OpenFeign.controller;

import com.example.Ch11_Ex1_OpenFeign.clients.PaymentProxy;
import com.example.Ch11_Ex1_OpenFeign.model.PaymentServiceModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentProxyController {

    private final PaymentProxy paymentProxy;

    public PaymentProxyController(PaymentProxy paymentProxy) {
        this.paymentProxy = paymentProxy;
    }


    @PostMapping("/payment")
    public PaymentServiceModel pay(@RequestBody PaymentServiceModel paymentServiceModel){
        String rId = UUID.randomUUID().toString();

        return paymentProxy.pay(rId,paymentServiceModel);

    }
}
