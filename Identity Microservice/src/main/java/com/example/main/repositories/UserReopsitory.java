package com.example.main.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.entities.User;

@Repository
public interface UserReopsitory extends JpaRepository<User, Integer>{
  Optional<User> findByUsername(String username);
}
