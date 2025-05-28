package com.example.Ch10_Ex6.controller;

import com.example.Ch10_Ex6.WelcomeMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class RequestBodyExample {

    Logger lo = Logger.getAnonymousLogger();


    @PostMapping("/hello")
    public ResponseEntity<WelcomeMessage> welcomeMessage(@RequestBody WelcomeMessage wm){


        lo.info("welcome "+wm.getName());

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(wm);



    }
}
