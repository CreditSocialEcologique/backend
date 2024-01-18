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

    public BddScores updateFinalScore(Long id) {
        return bddScoresRepository.findById(id).map(bddScores -> {
            bddScores.calculateFinalScore();
            return bddScoresRepository.save(bddScores);
        }).orElseThrow(() -> new NoSuchElementException("Score with ID " + id + " not found."));
    }

    public void updateFinalScoreForAll() {
        List<BddScores> allScores = bddScoresRepository.findAll();
        for (BddScores bddScore : allScores) {
            bddScore.calculateFinalScore();
            bddScoresRepository.save(bddScore);
        }
    }

    public Optional<BddScores> getScores(int id) {
        return bddScoresRepository.findById((long) id);
    }

    public void save(BddScores bddScores) {
        bddScoresRepository.save(bddScores);
    }
}

