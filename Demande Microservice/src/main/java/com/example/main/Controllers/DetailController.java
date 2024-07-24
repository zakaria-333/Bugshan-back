package com.example.main.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.services.DetailService;

@RestController
@RequestMapping("/detail")
public class DetailController {
    @Autowired
    private DetailService detailService;
    
}
