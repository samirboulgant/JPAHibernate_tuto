package com.evaluation_jpa.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    List<Projet> projets;

}
