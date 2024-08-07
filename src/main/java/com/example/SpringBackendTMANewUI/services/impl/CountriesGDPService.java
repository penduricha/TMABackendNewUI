package com.example.SpringBackendTMANewUI.services.impl;

import com.example.SpringBackendTMANewUI.models.CountriesGDP;
import com.example.SpringBackendTMANewUI.repositories.CountriesGDPRepository;
import com.example.SpringBackendTMANewUI.services.I_CountriesGDPService;
import org.springframework.data.domain.Sort;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountriesGDPService implements I_CountriesGDPService {
    private final CountriesGDPRepository countriesGDPRepository;

    public CountriesGDPService(CountriesGDPRepository countriesGDPRepository) {
        this.countriesGDPRepository = countriesGDPRepository;
    }

    @Override
    public CountriesGDP saveCountriesGDP(CountriesGDP countriesGDP) throws JpaSystemException {
        return countriesGDPRepository.save(countriesGDP);
    }

    @Override
    public List<CountriesGDP> getAllCountriesGDPs() {
        return countriesGDPRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }
}
