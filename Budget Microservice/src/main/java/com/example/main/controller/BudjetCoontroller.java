package com.example.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.services.BudjetService;

@RestController
@RequestMapping("/budjet")
public class BudjetCoontroller {

    @Autowired
    private BudjetService budjetService;
    
}
