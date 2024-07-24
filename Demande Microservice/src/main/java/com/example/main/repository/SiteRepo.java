package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.entities.Site;

@Repository
public interface SiteRepo extends JpaRepository <Site,Integer> {
    
}
