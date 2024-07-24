package com.example.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.repository.DetailRepo;

@Service
public class DetailService {
    @Autowired
    private DetailRepo detailRepo;
    
}
