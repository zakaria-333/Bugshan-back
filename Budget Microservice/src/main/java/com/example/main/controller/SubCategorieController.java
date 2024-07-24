package com.example.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.services.SubCategorieService;

@RestController
@RequestMapping("/subCategory")
public class SubCategorieController {
@Autowired
private SubCategorieService subCategorieService;
    
}
