package com.evaluation_jpa.service;

import com.evaluation_jpa.entity.Projet;
import com.evaluation_jpa.entity.Tache;
import org.springframework.stereotype.Service;

public interface IProjetService {
    Projet AddTacheToProjet(Projet projet, Tache tache);
    void saveWithUtilisateur(String titre,String description,long id);
}
