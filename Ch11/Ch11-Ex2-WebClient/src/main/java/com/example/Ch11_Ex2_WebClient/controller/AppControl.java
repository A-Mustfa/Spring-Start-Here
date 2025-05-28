package com.example.Ch11_Ex2_WebClient.controller;

import com.example.Ch11_Ex2_WebClient.model.PaymentServiceModel;
import com.example.Ch11_Ex2_WebClient.proxy.WebClientProxy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
public class AppControl {
    private final WebClientProxy webClientProxy;

    public AppControl(WebClientProxy webClientProxy) {
        this.webClientProxy = webClientProxy;
    }


    @PostMapping("/payment")
    public Mono<PaymentServiceModel> pay(@RequestBody PaymentServiceModel paymentServiceModel){
        String id = UUID.randomUUID().toString();
        return webClientProxy.pay(id,paymentServiceModel);
    }
}
