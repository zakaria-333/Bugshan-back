package com.example.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.repository.SiteRepo;

@Service
public class SiteService {

    @Autowired
    private SiteRepo siteRepo;
    
}
