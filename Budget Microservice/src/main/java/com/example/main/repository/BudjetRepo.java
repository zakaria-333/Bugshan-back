package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.entities.HistoriqueBudget;

@Repository
public interface BudjetRepo extends JpaRepository <HistoriqueBudget,Integer>{
    
}