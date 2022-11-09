package com.mariekore.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String tel;
    private String Description;

    public Client(String nom, String prenom, String tel, String description) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        Description = description;
    }
}
