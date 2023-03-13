package com.evaluation_jpa.service;

import com.evaluation_jpa.entity.Projet;
import com.evaluation_jpa.entity.Tache;
import com.evaluation_jpa.repository.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TacheServiceImpl implements ItacheService{
    @Autowired
    TacheRepository tacheRepository;


    @Override
    public Tache addTacheToProjet(Tache tache,Projet projet) {
        tache.setProjet(projet);
        return tacheRepository.save(tache);
    }

    @Override
    public List<Tache> Rechercher() {
        return tacheRepository.Chercher();
    }

    @Override
    public List<Tache> RechercheTacheByTitre(String titre) {
        return tacheRepository.findTacheByTitreOrderByIdAsc(titre);
    }

    @Override
    public void deleteTachesByIdProject(long id) {
        tacheRepository.deleteTachesByProjetId(id);
    }

    @Override
    public void supprimerTache(Long id) {
        tacheRepository.supprimerTache(id);
    }
}
