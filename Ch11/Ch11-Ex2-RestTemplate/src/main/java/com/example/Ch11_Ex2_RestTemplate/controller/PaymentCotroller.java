package com.example.Ch11_Ex2_RestTemplate.controller;

import com.example.Ch11_Ex2_RestTemplate.model.Payment;
import com.example.Ch11_Ex2_RestTemplate.proxy.AppTemplateProxy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PaymentCotroller {
    private final AppTemplateProxy appTemplateProxy;

    public PaymentCotroller(AppTemplateProxy appTemplateProxy) {
        this.appTemplateProxy = appTemplateProxy;
    }


    @PostMapping("/payment")
    public Payment pay(@RequestBody Payment payment){
        return appTemplateProxy.pay(payment);
    }
}
