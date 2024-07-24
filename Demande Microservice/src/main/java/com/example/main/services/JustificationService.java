package com.example.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.repository.JustificationRepo;

@Service
public class JustificationService {

    @Autowired
    private JustificationRepo justificationRepo; 


    
}
