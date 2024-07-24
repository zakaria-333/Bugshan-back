package com.example.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.repository.DemandeRepo;

@Service
public class DemandeService {
    @Autowired
    private DemandeRepo demandeRepo;
    
}
