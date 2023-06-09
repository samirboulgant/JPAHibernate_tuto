package com.evaluation_jpa.service;

import com.evaluation_jpa.entity.Projet;
import com.evaluation_jpa.entity.Tache;
import com.evaluation_jpa.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProjetServiceImpl implements IProjetService{
    @Autowired
    ProjetRepository projetRepository;



    @Override
    public Projet AddTacheToProjet(Projet projet, Tache tache) {
        projet.getTaches().add(tache);
        return projet;
    }

    @Override
    public List<Projet> rechercher() {
        return projetRepository.chercher();
    }

    @Override
    public List<Projet> rechercherProjetByTitre(String titre) {
        return projetRepository.findProjetByTitreOrderByIdAsc(titre);
    }

    @Override
    public void saveWithUtilisateur(String titre,String description,long id) {
        projetRepository.saveWithUtilisateur(titre,description,id);
    }
}
