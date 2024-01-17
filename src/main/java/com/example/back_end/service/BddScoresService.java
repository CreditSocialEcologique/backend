package com.example.back_end.service;


import com.example.back_end.model.BddScores;
import com.example.back_end.repository.BddScoresRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BddScoresService {
    @Autowired
    private BddScoresRepository bddScoresRepository;

    public BddScores calculateFinalScore(BddScores bddScores) {
        int finalScore = bddScores.getScoreTransport() + bddScores.getScoreEnergie() + bddScores.getScoreAlimentation();
        bddScores.setFinalScore(finalScore);
        return bddScores;
    }


    public BddScores saveBddScoresScore(BddScores bddScores) {
        // Calculer le score final avant de sauvegarder
        BddScores updatedBddScores = calculateFinalScore(bddScores);
        // Sauvegarder dans la base de données
        return bddScoresRepository.save(updatedBddScores);
    }
}


