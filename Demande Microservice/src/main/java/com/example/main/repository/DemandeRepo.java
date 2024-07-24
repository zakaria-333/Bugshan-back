package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.entities.Demande;

@Repository
public interface DemandeRepo extends JpaRepository <Demande,Integer> {
    
}
