package com.example.back_end.service;

import com.example.back_end.model.BddScores;
import com.example.back_end.repository.BddScoresRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Service
@Transactional
public class BddScoresService {
    @Autowired
    private BddScoresRepository bddScoresRepository;

    /**
     * Met à jour le score final d'un utilisateur
     * @param id id de l'utilisateur
     * @return l'utilisateur avec son score final mis à jour
     */
    public BddScores updateFinalScore(Long id) {
        return bddScoresRepository.findById(id).map(bddScores -> {
            bddScores.calculateFinalScore();
            return bddScoresRepository.save(bddScores);
        }).orElseThrow(() -> new NoSuchElementException("Score with ID " + id + " not found."));
    }

    /**
     * Met à jour le score final de tous les utilisateurs
     */
    public void updateFinalScoreForAll() {
        List<BddScores> allScores = bddScoresRepository.findAll();
        for (BddScores bddScore : allScores) {
            bddScore.calculateFinalScore();
            bddScoresRepository.save(bddScore);
        }
    }

    /**
     * Récupère le score d'un utilisateur
     * @param id id de l'utilisateur
     * @return l'utilisateur avec son score
     */
    public Optional<BddScores> getScores(int id) {
        return bddScoresRepository.findById((long) id);
    }
    /**
     * Enregistre le score d'un utilisateur
     * @param bddScores score de l'utilisateur
     */
    public void save(BddScores bddScores) {
        bddScoresRepository.save(bddScores);
    }
}

