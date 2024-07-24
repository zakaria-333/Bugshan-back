package com.example.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.repositories.RoleRepo;

@Service
public class RoleService {
    @Autowired
    private RoleRepo roleRepo;
    
}
