package com.example.SpringBackendTMANewUI.controllers;

import com.example.SpringBackendTMANewUI.models.CountriesGDP;
import com.example.SpringBackendTMANewUI.models.User;
import com.example.SpringBackendTMANewUI.services.impl.CountriesGDPService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCountriesController {
    private final CountriesGDPService countriesGDPService;

    public TestCountriesController(CountriesGDPService countriesGDPService) {
        this.countriesGDPService = countriesGDPService;
    }
    @RequestMapping("/postCountriesGDP")
    public String postData(){
        try{
            CountriesGDP countriesGDP1=new CountriesGDP(1L,"USA",30,"#3665ca");
            CountriesGDP countriesGDP2=new CountriesGDP(2L,"China",25,"#da3b15");
            CountriesGDP countriesGDP3=new CountriesGDP(3L,"Russia",10,"#f89c0b");
            CountriesGDP countriesGDP4=new CountriesGDP(4L,"Germany",8,"#16951e");
            CountriesGDP countriesGDP5=new CountriesGDP(5L,"United Kingdom",10,"#970c9b");
            CountriesGDP countriesGDP6=new CountriesGDP(6L,"Turkey",7,"#3c3daa");
            countriesGDPService.saveCountriesGDP(countriesGDP1);
            countriesGDPService.saveCountriesGDP(countriesGDP2);
            countriesGDPService.saveCountriesGDP(countriesGDP3);
            countriesGDPService.saveCountriesGDP(countriesGDP4);
            countriesGDPService.saveCountriesGDP(countriesGDP5);
            countriesGDPService.saveCountriesGDP(countriesGDP6);
            return "Success";
        }catch(Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }


}
