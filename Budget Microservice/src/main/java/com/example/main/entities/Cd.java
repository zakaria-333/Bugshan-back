package com.example.main.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Cd extends User{
  @OneToOne
  private Site site;
}
