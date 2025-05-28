package com.example.Ch8_Ex4.controller;

import com.example.Ch8_Ex4.model.Product;
import com.example.Ch8_Ex4.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }


    @GetMapping("/Product")
    public String getProducts(Model model){
        var products = productService.getProducts();

        model.addAttribute("products", products );
        return "hello.html";
    }

    @PostMapping(value = "/Product")
    public String addProducts(@RequestParam String name, @RequestParam double price, Model model){
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);

        productService.putProduct(product);
        var products = productService.getProducts();
        model.addAttribute("products", products );

        return "hello.html";
    }



}
