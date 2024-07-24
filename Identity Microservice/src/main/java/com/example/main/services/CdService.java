package com.example.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.repositories.CdRepo;

@Service
public class CdService {
    @Autowired
    private CdRepo cdRepo;
     
    
}
