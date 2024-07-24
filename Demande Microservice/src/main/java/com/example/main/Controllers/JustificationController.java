package com.example.main.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.services.JustificationService;

@RestController
@RequestMapping("/justification")
public class JustificationController {
    @Autowired
    private JustificationService justificationService;

    
}
