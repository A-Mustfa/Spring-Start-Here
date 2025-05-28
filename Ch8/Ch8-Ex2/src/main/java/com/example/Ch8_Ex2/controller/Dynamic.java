package com.example.Ch8_Ex2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Dynamic {


    @RequestMapping("/DynamicDemo2")
    public String doDynamic(@RequestParam(required = false) String color, @RequestParam String name,Model model){
        model.addAttribute("name",name);
        model.addAttribute("color",color);
        return "hello.html";
    }
}
