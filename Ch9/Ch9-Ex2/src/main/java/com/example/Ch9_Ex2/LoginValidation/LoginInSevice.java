package com.example.Ch9_Ex2.LoginValidation;

import com.example.Ch9_Ex2.sessions.UserLogedSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginInSevice {
    private String name;
    private String password;
    private final UserLogedSession userLogedSession;
    public LoginInSevice(UserLogedSession userLoginSession){
        this.userLogedSession = userLoginSession;
    }

    public boolean valid() {
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
