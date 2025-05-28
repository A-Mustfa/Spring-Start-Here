package com.example.Ch14_Ex1.restControllers;

import com.example.Ch14_Ex1.dto.RequestDto;
import com.example.Ch14_Ex1.repoModel.Account;
import com.example.Ch14_Ex1.service.AccountService;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransferController {
    private final AccountService accountService;

    public TransferController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/transfer")
    public void transferMoney(@RequestBody RequestDto requestDto){
        accountService.transferMoney(
                requestDto.getSenderId(),requestDto.getReceiverId(),requestDto.getAmount()
        );
    }


    @GetMapping("/viewAccounts")
    public Iterable<Account> viewAcc(@RequestParam(required = false) String name){

        if(name != null){
            return accountService.findAccountsByName(name);
        }
        else {
            return accountService.findAll();
        }

    }


}
