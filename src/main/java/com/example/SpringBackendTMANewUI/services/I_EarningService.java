package com.example.SpringBackendTMANewUI.services;
import com.example.SpringBackendTMANewUI.models.Earning;
import java.util.List;

public interface I_EarningService {
    public Earning saveEarning(Earning earning);
    public List<Earning> getAllEarnings();
}
