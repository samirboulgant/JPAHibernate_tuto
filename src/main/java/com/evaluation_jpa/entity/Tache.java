package com.evaluation_jpa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_tache;
    @Column(nullable = false)
    private String titre;
    @Column(nullable = false)
    private String description;

    // un lien vers le proet parent
    @ManyToOne
    @JoinColumn(name = "id_projet")
    Projet projet;
}
