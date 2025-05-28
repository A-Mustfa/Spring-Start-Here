package com.example.Ch12_Ex1.controller;

import com.example.Ch12_Ex1.model.Purchase;
import com.example.Ch12_Ex1.repo.PurchaseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    private final PurchaseRepository repository;

    public PurchaseController(PurchaseRepository repository) {
        this.repository = repository;
    }


    @GetMapping
    public List<Purchase> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public void store(@RequestBody Purchase purchase){
        repository.store(purchase);

    }

}
