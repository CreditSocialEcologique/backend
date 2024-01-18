package com.example.back_end.repository;

import com.example.back_end.model.BddScores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BddScoresRepository extends JpaRepository<BddScores, Long> {
    // Méthodes personnalisées si nécessaire...
}
