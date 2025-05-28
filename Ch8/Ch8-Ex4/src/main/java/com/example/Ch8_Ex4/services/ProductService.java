package com.example.Ch8_Ex4.services;

import com.example.Ch8_Ex4.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void putProduct(Product product) {
        products.add(product);
    }
}
