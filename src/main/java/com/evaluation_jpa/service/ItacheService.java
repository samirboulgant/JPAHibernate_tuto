package com.evaluation_jpa.service;

import com.evaluation_jpa.entity.Projet;
import com.evaluation_jpa.entity.Tache;

public interface ItacheService {
    Tache addTacheToProjet(Tache tache,Projet projet);
    void deleteTachesByIdProject(long id);
    void supprimerTache(Long id);
}
