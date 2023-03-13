package com.evaluation_jpa.service;

import com.evaluation_jpa.entity.Projet;
import com.evaluation_jpa.entity.Tache;

import java.util.List;

public interface ItacheService {
    Tache addTacheToProjet(Tache tache,Projet projet);
    List<Tache> Rechercher();
    List<Tache> RechercheTacheByTitre(String titre);
    void deleteTachesByIdProject(long id);
    void supprimerTache(Long id);
}
