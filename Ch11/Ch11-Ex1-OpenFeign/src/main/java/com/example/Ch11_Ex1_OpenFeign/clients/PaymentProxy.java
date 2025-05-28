package com.example.Ch11_Ex1_OpenFeign.clients;

import com.example.Ch11_Ex1_OpenFeign.model.PaymentServiceModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name="firstFeign",url = "${name.service.url}")
public interface PaymentProxy {
    @PostMapping("/payment")
    PaymentServiceModel pay(@RequestHeader String rId, @RequestBody PaymentServiceModel paymentServiceModel);
}
