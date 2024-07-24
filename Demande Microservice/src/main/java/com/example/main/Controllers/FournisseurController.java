package com.example.main.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.services.FournisseurService;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurController {
    @Autowired
    private FournisseurService fooFournisseurService;
    
}
