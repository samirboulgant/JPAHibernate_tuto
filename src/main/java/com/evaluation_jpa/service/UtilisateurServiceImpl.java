package com.evaluation_jpa.service;

import com.evaluation_jpa.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurServiceImpl implements IUtilisateurService{
    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Override
    public void deleteById(long id) {
        utilisateurRepository.deleteById(id);
    }
}
