package com.example.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.repositories.UserReopsitory;

@Service
public class UserService {
   @Autowired
   private UserReopsitory userReopsitory;
    
}
