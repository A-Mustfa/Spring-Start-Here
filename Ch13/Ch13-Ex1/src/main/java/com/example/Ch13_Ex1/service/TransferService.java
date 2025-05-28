package com.example.Ch13_Ex1.service;

import com.example.Ch13_Ex1.models.AccountModel;
import com.example.Ch13_Ex1.repository.TransferRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TransferService {

    private final TransferRepository transferRepository;

    public TransferService(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }
    @Transactional
    public void transfer(int senderId, int receiverId, BigDecimal amount){
        AccountModel sender = transferRepository.findAccById(senderId);
        AccountModel receiver = transferRepository.findAccById(receiverId);

        BigDecimal senderNewAmount = sender.getAmount().subtract(amount);
        BigDecimal receiverNewAmount = receiver.getAmount().add(amount);



        transferRepository.changeAmount(senderNewAmount,senderId);
        transferRepository.changeAmount(receiverNewAmount,receiverId);
//        throw new RuntimeException();

    }


    public List<AccountModel> findAll(){
        return transferRepository.findAll();
    }
}
