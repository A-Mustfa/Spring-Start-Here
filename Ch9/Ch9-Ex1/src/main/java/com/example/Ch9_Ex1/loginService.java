package com.example.Ch9_Ex1;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class loginService {
    private String name;
    private String password;

    public Boolean valid(){
        if("ahmed".equals(this.getName()) && "123456".equals(this.getPassword())){
            return true;
        }
        else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
