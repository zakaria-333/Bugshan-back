package com.example.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.repositories.DemandeurRepo;


@Service
public class DemandeurService {
    @Autowired
    private DemandeurRepo demandeurRepo;
    
}
