package com.evaluation_jpa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_projet;
    @Column(nullable = false)
    private String titre;
    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    Utilisateur utilisateur;

    @OneToMany(mappedBy = "projet")
    List<Tache> taches;


}
