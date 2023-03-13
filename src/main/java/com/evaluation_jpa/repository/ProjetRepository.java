package com.evaluation_jpa.repository;

import com.evaluation_jpa.entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet,Long> {
}
