package com.example.SpringBackendTMANewUI.services;

import com.example.SpringBackendTMANewUI.models.CountriesGDP;
import com.example.SpringBackendTMANewUI.models.User;

import java.util.List;

public interface I_CountriesGDPService {
    public CountriesGDP  saveCountriesGDP(CountriesGDP countriesGDP);
    public List<CountriesGDP> getAllCountriesGDPs();
}
