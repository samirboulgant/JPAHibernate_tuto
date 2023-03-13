package com.evaluation_jpa.repository;

import com.evaluation_jpa.entity.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacheRepository extends JpaRepository<Tache,Long> {
}
