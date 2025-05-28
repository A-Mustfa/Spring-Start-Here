package com.example.Ch9_Ex3.LoginValidation;

import com.example.Ch9_Ex3.counter.Counter;
import com.example.Ch9_Ex3.sessions.UserLogedSession;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginInSevice {
    private String name;
    private String password;
    private final UserLogedSession userLogedSession;
    private final Counter counter;
    public LoginInSevice(UserLogedSession userLoginSession, Counter counter){
        this.counter=counter;
        this.userLogedSession = userLoginSession;
    }

    public boolean valid() {
        counter.increment();
        String username = this.getName();
        String password = this.getPassword();

        boolean loginResult = false;
        if ("ahmed".equals(username) && "password".equals(password)) {
            loginResult = true;
            userLogedSession.setName(username);

        }

        return loginResult;
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
