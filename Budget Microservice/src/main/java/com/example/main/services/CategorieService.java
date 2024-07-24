package com.example.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.repository.CategoryRepo;

@Service
public class CategorieService {
    @Autowired
    private CategoryRepo categoryRepo;
    
}
