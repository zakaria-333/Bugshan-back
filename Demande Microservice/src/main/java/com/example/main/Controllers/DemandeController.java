package com.example.main.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.services.DemandeService;

@RestController
@RequestMapping("/demande")
public class DemandeController {
    @Autowired
    private DemandeService demandeService;
    
}
