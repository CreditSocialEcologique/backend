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
    private int nuisanceSonore;
    private int pollutionLumineuse;
    private int finalScore;

    // Constructeur par défaut
    public BddScores() {
    }

    // Constructeur avec tous les paramètres
    public BddScores(Long id, int scoreTransport, int scoreEnergie, int scoreAlimentation, int nuisanceSonore, int pollutionLumineuse, int finalScore) {
        this.id = id;
        this.scoreTransport = scoreTransport;
        this.scoreEnergie = scoreEnergie;
        this.scoreAlimentation = scoreAlimentation;
        this.nuisanceSonore = nuisanceSonore;
        this.pollutionLumineuse = pollutionLumineuse;
        this.finalScore = finalScore;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public int getScoreTransport() {
        return scoreTransport;
    }

    public int getScoreEnergie() {
        return scoreEnergie;
    }

    public int getScoreAlimentation() {
        return scoreAlimentation;
    }

    public int getNuisanceSonore() {
        return nuisanceSonore;
    }

    public int getPollutionLumineuse() {
        return pollutionLumineuse;
    }

    public int getFinalScore() {
        return finalScore;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }



    public void setScoreTransport(int scoreTransport) {
        this.scoreTransport = scoreTransport;
    }

    public void setScoreEnergie(int scoreEnergie) {
        this.scoreEnergie = scoreEnergie;
    }

    public void setScoreAlimentation(int scoreAlimentation) {
        this.scoreAlimentation = scoreAlimentation;
    }

    public void setNuisanceSonore(int nuisanceSonore) {
        this.nuisanceSonore = nuisanceSonore;
    }

    public void setPollutionLumineuse(int pollutionLumineuse) {
        this.pollutionLumineuse = pollutionLumineuse;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    // Méthode pour calculer le finalScore
    public void calculateFinalScore() {
        this.finalScore = this.scoreTransport + this.scoreEnergie + this.scoreAlimentation + this.nuisanceSonore + this.pollutionLumineuse;
    }
}
