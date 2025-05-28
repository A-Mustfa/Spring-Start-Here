package com.example.Ch10_Ex5.controller;


import com.example.Ch10_Ex5.services.PaymentService;
import com.example.Ch10_Ex5.model.PaymentProcess;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentProcess> paymentValidation(){
            PaymentProcess paymentProcess = paymentService.payment();
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentProcess);
    }


}
