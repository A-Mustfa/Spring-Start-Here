package com.example.Ch12_Ex2.controller;

import com.example.Ch12_Ex2.model.Purchase;
import com.example.Ch12_Ex2.repo.PurchaseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    private final PurchaseRepository purchaseRepository;

    public PurchaseController(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }


    @GetMapping
    public List<Purchase> find(){
        return purchaseRepository.findAll();
    }


    @PostMapping
    public void store(@RequestBody Purchase purchase){
        purchaseRepository.store(purchase);
    }
}
