package com.example.SpringBackendTMANewUI.repositories;

import com.example.SpringBackendTMANewUI.models.Earning;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EarningRepository extends JpaRepository<Earning,Long> {
}
