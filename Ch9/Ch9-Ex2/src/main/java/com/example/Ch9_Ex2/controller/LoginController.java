package com.example.Ch9_Ex2.controller;

import com.example.Ch9_Ex2.LoginValidation.LoginInSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;
@Controller
public class LoginController {

    private LoginInSevice loginInSevice;
    public LoginController(LoginInSevice loginInSevice){
        this.loginInSevice = loginInSevice;
    }

    @GetMapping("/")
    public String loginGet(){
        return "login.html";
    }


    @PostMapping("/")
    public String loginPost(@RequestParam String name,@RequestParam String password, Model model){
        loginInSevice.setName(name);
        loginInSevice.setPassword(password);

        boolean logged = loginInSevice.valid();

        if(logged){
            return "redirect:/main";
        }

        model.addAttribute("message","invalid info");
        return "login.html";
    }
}
