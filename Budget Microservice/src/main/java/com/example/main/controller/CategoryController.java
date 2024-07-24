package com.example.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.entities.Categorie;
import com.example.main.services.CategorieService;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategorieService categorieService;
    
}
