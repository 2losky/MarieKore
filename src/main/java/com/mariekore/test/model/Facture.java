package com.mariekore.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numFact;
    private double montantTotal;
    private Date date;
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "CLT")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "FOUR")
    private Fournisseur fournisseur;



}
