package com.example.Ch10_Ex5.restAdvice;

import com.example.Ch10_Ex5.Error.ErrorMessage;
import com.example.Ch10_Ex5.exception.NoEnoughMoneyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAspect {

    @ExceptionHandler(NoEnoughMoneyException.class)
    public ResponseEntity<ErrorMessage> errorMessage(){
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setMessage("No Enough Money");
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errorMessage);
    }
}
