package com.example.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.repository.FilialeRepo;

@Service
public class FilialeService {
    @Autowired
    private FilialeRepo filialeRepo;
    
}
