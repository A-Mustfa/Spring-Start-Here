package org.example.Ch10_Ex3;

import org.example.Ch10_Ex3.DTOs.Country;
import org.example.Ch10_Ex3.userSession.userSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Country> viewAll(){
        Country c1 = userS.getCountries().get(0);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Continent:","africa")
                .header("capital","cairo")
                .header("favourite_food","Koshary")
                .body(c1);

    }
}
