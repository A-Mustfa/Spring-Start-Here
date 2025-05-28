package com.example.Ch9_Ex1.Controllers;

import com.example.Ch9_Ex1.loginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {


    @GetMapping("/")
    public String loginGet(){
        return "login";
    }

    @PostMapping("/")
    public String loginPost(loginService loginService, Model model){
        Boolean valid = loginService.valid();

        if(valid){
            model.addAttribute("message","you are logged in");
        }
        else {
            model.addAttribute("message","invalid");
        }
        return "login";

    }


}
