package com.example.Ch11_Ex2_WebClient.proxy;

import com.example.Ch11_Ex2_WebClient.model.PaymentServiceModel;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class WebClientProxy {
    private final WebClient webClient;

    public WebClientProxy(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<PaymentServiceModel> pay(String rId, PaymentServiceModel payment){
        String uri = "http://localhost:8080/payment";

        return webClient.post()
                .uri(uri)
                .header("rId",rId)
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(payment),PaymentServiceModel.class)
                .retrieve()
                .bodyToMono(PaymentServiceModel.class);


    }



}
