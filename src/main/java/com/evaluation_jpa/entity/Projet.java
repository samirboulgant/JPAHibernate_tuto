package com.evaluation_jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@NamedNativeQuery(name="Projet.saveWithUtilisateur",query = "insert into Projet(titre, description, id_utilisateur) VALUES (:titre, :description, :id)")
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String titre;
    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    @JsonIgnore
    Utilisateur utilisateur;

    @OneToMany(mappedBy = "projet",cascade = CascadeType.ALL)
    @JsonIgnore
    List<Tache> taches;


}
