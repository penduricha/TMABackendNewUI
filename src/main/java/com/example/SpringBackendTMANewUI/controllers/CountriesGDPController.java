package com.example.SpringBackendTMANewUI.controllers;

import com.example.SpringBackendTMANewUI.models.CountriesGDP;
import com.example.SpringBackendTMANewUI.models.User;
import com.example.SpringBackendTMANewUI.services.impl.CountriesGDPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countriesGDPs")
public class CountriesGDPController {
    private final CountriesGDPService countriesGDPService;
    @Autowired
    public CountriesGDPController(CountriesGDPService countriesGDPService) {
        this.countriesGDPService = countriesGDPService;
    }
    @GetMapping
    public List<CountriesGDP> getAllCountriesGDPs() throws JpaSystemException {
        return countriesGDPService.getAllCountriesGDPs();
    }
    //phuong thuc POST
    @PostMapping
    public CountriesGDP createCountriesGDP(@RequestBody CountriesGDP countriesGDP) throws JpaSystemException{
        return countriesGDPService.saveCountriesGDP(countriesGDP);
        //return ResponseEntity.status(HttpStatus.CREATED).body(savedCustomer);
    }
}
