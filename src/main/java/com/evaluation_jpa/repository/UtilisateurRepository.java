package com.evaluation_jpa.repository;

import com.evaluation_jpa.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {

    @Query(value ="select * from Utilisateur order by id asc" ,nativeQuery = true)
    List<Utilisateur> Chercher();
    List<Utilisateur> findUtilisateurByNomOrderByIdAsc(String nom);
}
