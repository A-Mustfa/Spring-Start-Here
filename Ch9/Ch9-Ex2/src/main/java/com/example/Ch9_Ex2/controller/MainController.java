package com.example.Ch9_Ex2.controller;

import com.example.Ch9_Ex2.LoginValidation.LoginInSevice;
import com.example.Ch9_Ex2.sessions.UserLogedSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class MainController {

    private final UserLogedSession userLogedSession;
    public MainController(UserLogedSession userLogedSession){
        this.userLogedSession = userLogedSession;
    }
    @GetMapping("/main")
    public String getLogin(@RequestParam(required = false) String logout, Model model ){
        if(logout != null){
            userLogedSession.setName(null);
        }

        String name = userLogedSession.getName();
        if(name == null){
            return "redirect:/";
        }

        model.addAttribute("name",name);
        return "welcome.html";
    }


}
