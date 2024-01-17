package com.example.back_end.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "scores")
public class BddScores {
    @Id
    private Long id;
    private int scoreTransport;
    private int scoreEnergie;
    private int scoreAlimentation;
    private int finalScore; // Ajouter cette ligne pour la nouvelle colonne

    // Getters and Setters pour finalScore
    public int getScoreTransport() {
        return scoreTransport;
    }

    public int getScoreEnergie() {
        return scoreEnergie;
    }

    public int getScoreAlimentation() {
        return scoreAlimentation;
    }

    // Setter
    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }
}

