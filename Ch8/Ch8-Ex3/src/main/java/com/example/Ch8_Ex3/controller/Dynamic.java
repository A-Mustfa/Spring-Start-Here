package com.example.Ch8_Ex3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Dynamic {


    @RequestMapping("/DynamicDemo2/{color}")
    public String doDynamic(@PathVariable String color, Model model){
        model.addAttribute("name","ahmed");
        model.addAttribute("color",color);
        return "hello.html";
    }
}
