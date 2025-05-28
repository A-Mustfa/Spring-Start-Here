package com.example.Ch11_Payments.controller;

import com.example.Ch11_Payments.model.PaymentServiceModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentsServiceController {
    Logger log = Logger.getLogger(PaymentsServiceController.class.getName());


    @PostMapping("/payment")
    public ResponseEntity<PaymentServiceModel> pay(@RequestHeader String rId, @RequestBody PaymentServiceModel paymentServiceModel){
        log.info("received request with id: "+ rId +"; payment amount "+ paymentServiceModel.getName());

        paymentServiceModel.setId("2269");

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON) //important
                .header("rId",rId)
                .body(paymentServiceModel);


    }


}
