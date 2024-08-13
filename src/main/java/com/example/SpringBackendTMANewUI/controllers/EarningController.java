package com.example.SpringBackendTMANewUI.controllers;

import com.example.SpringBackendTMANewUI.models.Earning;
import com.example.SpringBackendTMANewUI.models.User;
import com.example.SpringBackendTMANewUI.services.impl.EarningService;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/earnings")
public class EarningController {
    private final EarningService earningService;

    public EarningController(EarningService earningService) {
        this.earningService = earningService;
    }
    @GetMapping
    public List<Earning> getAllEarnings() throws JpaSystemException {
        return earningService.getAllEarnings();
    }
    @PostMapping
    public Earning saveEarning(@RequestBody Earning earning) throws JpaSystemException{
        return earningService.saveEarning(earning);
    }
}
