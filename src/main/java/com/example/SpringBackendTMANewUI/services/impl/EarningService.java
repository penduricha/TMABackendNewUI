package com.example.SpringBackendTMANewUI.services.impl;

import com.example.SpringBackendTMANewUI.models.Earning;
import com.example.SpringBackendTMANewUI.repositories.EarningRepository;
import com.example.SpringBackendTMANewUI.services.I_EarningService;
import org.springframework.data.domain.Sort;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EarningService implements I_EarningService {
    private final EarningRepository earningRepository;

    public EarningService(EarningRepository earningRepository) {
        this.earningRepository = earningRepository;
    }

    @Override
    public Earning saveEarning(Earning earning) throws JpaSystemException {
        return earningRepository.save(earning);
    }

    @Override
    public List<Earning> getAllEarnings()throws JpaSystemException {
        return earningRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }
}
