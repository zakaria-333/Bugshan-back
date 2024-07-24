package com.example.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.services.AdjustementService;

@RestController
@RequestMapping("/adjustement")
public class AdjustementController {
    @Autowired
    private AdjustementService adjustementService;
    
}
