package org.example.Ch10_Ex2;

import org.example.Ch10_Ex2.DTOs.Country;
import org.example.Ch10_Ex2.userSession.userSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    private final userSession userS;

    public MainController(userSession userS) {
        this.userS = userS;
    }

    @PostMapping("/insertCountry")
    public void home(Country country){
        userS.addCountry(country);
    }


    @GetMapping("/viewCountreis")
    public List<Country> viewAll(){
        return userS.getCountries();
    }
}
