package com.example.main.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Detail{
  @EmbeddedId
  private DetailKey id;
  private int quantite;
  @ManyToOne
  @JoinColumn(name="demande", referencedColumnName = "id", insertable = false, updatable = false)
  private Demande demande;
  @ManyToOne
  @JoinColumn(name="subCategorie",referencedColumnName = "id", insertable = false, updatable = false)
  private SubCategorie subCategorie;
}
