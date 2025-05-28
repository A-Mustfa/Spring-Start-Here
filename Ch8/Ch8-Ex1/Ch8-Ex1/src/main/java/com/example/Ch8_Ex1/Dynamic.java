package com.example.Ch8_Ex1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Dynamic {


    @RequestMapping("/DynamicDemo1")
    public String doDynamic(Model model){
        model.addAttribute("name","ahmed");
        model.addAttribute("color","red");
        return "hello.html";
    }
}
