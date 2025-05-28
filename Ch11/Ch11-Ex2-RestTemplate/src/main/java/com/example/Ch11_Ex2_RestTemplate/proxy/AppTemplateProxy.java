package com.example.Ch11_Ex2_RestTemplate.proxy;

import com.example.Ch11_Ex2_RestTemplate.model.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;


@Component

public class AppTemplateProxy {
    private final RestTemplate rest;



    public AppTemplateProxy(RestTemplate rest){
        this.rest = rest;
    }


    public Payment pay(Payment payment){
        String uri = "http://localhost:8080/payment";
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        header.add("rId", UUID.randomUUID().toString());

        HttpEntity<Payment> data = new HttpEntity<>(payment,header);

        ResponseEntity<Payment> response = rest.exchange(uri, HttpMethod.POST,data,Payment.class);

        return response.getBody();
    }



}
