package com.evaluation_jpa.repository;

import com.evaluation_jpa.entity.Projet;
import com.evaluation_jpa.entity.Tache;
import com.evaluation_jpa.entity.Utilisateur;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjetRepository extends JpaRepository<Projet,Long> {
    @Query(value ="select * from projet order by id asc" ,nativeQuery = true)
    List<Projet> chercher();

    @Override
    List<Projet> findAll();

    List<Projet> findProjetByTitreOrderByIdAsc(String titre);

    @Modifying
    @Transactional
    void saveWithUtilisateur(@Param("titre") String titre,
                             @Param("description") String description,
                             @Param("id") long id);


}
