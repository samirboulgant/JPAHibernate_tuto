package com.evaluation_jpa.repository;

import com.evaluation_jpa.entity.Tache;
import com.evaluation_jpa.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TacheRepository extends JpaRepository<Tache,Long> {
    // chercher()
    @Query(value ="select * from tache order by id asc" ,nativeQuery = true)
    List<Tache> Chercher();
    //
    List<Tache> findTacheByTitreOrderByIdAsc(String name);
    void deleteTachesByProjetId(long id);

    @Query(value = "delete from tache where id_projet :idprojet",nativeQuery = true)
    void supprimerTache(@Param("idprojet") long id);

}
