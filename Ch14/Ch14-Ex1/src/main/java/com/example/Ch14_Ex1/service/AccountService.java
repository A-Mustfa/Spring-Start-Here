package com.example.Ch14_Ex1.service;

import com.example.Ch14_Ex1.exception.AccountNotFoundException;
import com.example.Ch14_Ex1.repoModel.Account;
import com.example.Ch14_Ex1.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void changeAmount(BigDecimal amount,long id){
        accountRepository.changeAmount(amount,id);
    }

    public Iterable<Account> findAll(){
        return accountRepository.findAll();
    }

    public List<Account> findAccountsByName(String name){
        return accountRepository.findAccountsByName(name);
    }

    @Transactional
    public void transferMoney(long senderId,long receiverId, BigDecimal amount){
        Account sender = accountRepository.findById(senderId).orElseThrow(() -> new AccountNotFoundException());
        Account receiver = accountRepository.findById(receiverId).orElseThrow(() -> new AccountNotFoundException());

        BigDecimal senderAmount = sender.getAmount().subtract(amount);
        BigDecimal receiverAmount = receiver.getAmount().add(amount);


        accountRepository.changeAmount(senderAmount,senderId);
        accountRepository.changeAmount(receiverAmount,receiverId);
    }

}
