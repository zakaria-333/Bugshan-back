package com.example.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.repository.AdjustementRepo;

@Service
public class AdjustementService {
    @Autowired
    private AdjustementRepo AdjustementRepo;
    
}
