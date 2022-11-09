package com.mariekore.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private double qte;
    private double prix;
    @ManyToOne
    @JoinColumn(name = "FACT")
    private Facture facture;
    @ManyToMany
    @JoinTable(name = "FournisseurProduit",
            joinColumns = @JoinColumn(name = "produit_id"),
            inverseJoinColumns = @JoinColumn(name = "fournisseur_id"))
    private List<Fournisseur> fournisseurs = new ArrayList<>();

    public Produit(String nom, double qte, double prix, List<Fournisseur> fournisseurs) {
        this.nom = nom;
        this.qte = qte;
        this.prix = prix;
        this.fournisseurs = fournisseurs;
    }
}
