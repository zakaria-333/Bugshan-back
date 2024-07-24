package com.example.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.repository.FournisseurRepo;

@Service
public class FournisseurService {
    @Autowired
    private FournisseurRepo fournisseurRepo;


    
}
