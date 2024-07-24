package com.example.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.repository.SubCategoryRepo;

@Service
public class SubCategorieService {
    @Autowired
    private SubCategoryRepo subCategoryRepo;
    
}
