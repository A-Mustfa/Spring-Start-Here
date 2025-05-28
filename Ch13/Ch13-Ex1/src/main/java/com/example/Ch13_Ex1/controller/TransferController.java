package com.example.Ch13_Ex1.controller;

import com.example.Ch13_Ex1.models.AccountModel;
import com.example.Ch13_Ex1.models.RequestModel;
import com.example.Ch13_Ex1.service.TransferService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransferController {

    private final TransferService service;

    public TransferController(TransferService service) {
        this.service = service;
    }


    @PostMapping("/transfer")
    public void transferMoney(@RequestBody RequestModel requestModel){
        service.transfer(requestModel.getSourceId(), requestModel.getDestinationId(), requestModel.getAmount());
    }


    @GetMapping("viewUsers")
    public List<AccountModel> getAccounts(){
        return service.findAll();
    }

}
