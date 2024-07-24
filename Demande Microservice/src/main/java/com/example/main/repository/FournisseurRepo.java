package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.entities.Fournisseur;

@Repository
public interface FournisseurRepo extends JpaRepository <Fournisseur,Integer> {
    
}
