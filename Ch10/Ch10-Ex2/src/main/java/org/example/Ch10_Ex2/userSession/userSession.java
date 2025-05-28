package org.example.Ch10_Ex2.userSession;

import org.example.Ch10_Ex2.DTOs.Country;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class userSession {

    private List<Country> countries = new ArrayList<>();


    public void addCountry(Country country){
        countries.add(country);
    }

    public List<Country> getCountries(){
        return countries;
    }

}
