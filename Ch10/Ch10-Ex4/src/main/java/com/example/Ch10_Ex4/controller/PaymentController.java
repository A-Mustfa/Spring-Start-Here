package com.example.Ch10_Ex4.controller;

import com.example.Ch10_Ex4.Error.ErrorMessage;
import com.example.Ch10_Ex4.model.PaymentProcess;
import com.example.Ch10_Ex4.services.PaymentService;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Ch10_Ex4.exception.NoEnoughMoneyException;

@RestController
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> paymentValidation(){
        try{
            PaymentProcess paymentProcess = paymentService.payment();
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentProcess);
        }catch(NoEnoughMoneyException ex){
            ErrorMessage errorMessage = new ErrorMessage();
            errorMessage.setMessage("No Enough Money");
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errorMessage);
        }


    }


}
