package com.evaluation_jpa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String titre;
    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_projet")
    Projet projet;

    public Tache(String titre, String description) {
        this.titre = titre;
        this.description = description;
    }

    public Tache() {

    }
}
