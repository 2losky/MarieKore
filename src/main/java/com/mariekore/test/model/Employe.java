package com.mariekore.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Employe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private double recette;
    private Date date;

    public Employe(String nom, String prenom, double recette, Date date) {
        this.nom = nom;
        this.prenom = prenom;
        this.recette = recette;
        this.date = date;
    }
}
