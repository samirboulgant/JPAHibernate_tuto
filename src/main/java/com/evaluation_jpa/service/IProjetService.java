package com.evaluation_jpa.service;

import com.evaluation_jpa.entity.Projet;
import com.evaluation_jpa.entity.Tache;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IProjetService {
    Projet AddTacheToProjet(Projet projet, Tache tache);
    List<Projet> rechercher();
    List<Projet> rechercherProjetByTitre(String titre);
    void saveWithUtilisateur(String titre,String description,long id);
}
