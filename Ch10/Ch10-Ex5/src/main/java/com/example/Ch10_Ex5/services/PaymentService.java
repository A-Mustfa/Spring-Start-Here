package com.example.Ch10_Ex5.services;

import com.example.Ch10_Ex5.exception.NoEnoughMoneyException;
import com.example.Ch10_Ex5.model.PaymentProcess;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentProcess payment(){
        throw new NoEnoughMoneyException();
    }
}
