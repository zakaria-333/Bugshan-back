package com.example.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.services.DemandeurService;

@RestController
@RequestMapping("/demandeur")
public class DemandeurController {
    @Autowired
    private DemandeurService demandeurService;
    
}
