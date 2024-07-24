package com.example.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.repository.BudjetRepo;

@Service
public class BudjetService {

    @Autowired
    private BudjetRepo BudjetRepo;
    
}
