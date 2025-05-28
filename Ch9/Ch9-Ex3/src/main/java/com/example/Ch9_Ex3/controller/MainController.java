package com.example.Ch9_Ex3.controller;

import com.example.Ch9_Ex3.counter.Counter;
import com.example.Ch9_Ex3.sessions.UserLogedSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class MainController {

    private final UserLogedSession userLogedSession;
    private final Counter count;
    public MainController(UserLogedSession userLogedSession, Counter count){
        this.userLogedSession = userLogedSession;
        this.count=count;
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
        int counter = count.getCounter();

        model.addAttribute("name",name);
        model.addAttribute("counter",counter);
        return "welcome.html";
    }


}
