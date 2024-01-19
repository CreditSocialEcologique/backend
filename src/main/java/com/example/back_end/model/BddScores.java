package com.example.back_end.model;

import jakarta.persistence.*;

@Entity
@Table(name = "scores")
public class BddScores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int scoreTransport;
    private int scoreEnergie;
    private int scoreAlimentation;
    private int nuisanceSonore;
    private int pollutionLumineuse;
    private int biodiversityProtectionScore;
    private int finalScore;
    private String prenom; // Ajout du champ prénom
    private String nom; // Ajout du champ nom
    private int age; // Ajout du champ age
    private String dateNaissance; // Ajout du champ dateNaissance
    private String mobile; // Ajout du champ mobile
    private String adresse; // Ajout du champ adresse
    private String compteBancaire; // Ajout du champ compteBancaire
    private String positionActuelle; // Ajout du champ positionActuelle

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

    // Ajout des getters et setters pour les champs manquants
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCompteBancaire() {
        return compteBancaire;
    }

    public void setCompteBancaire(String compteBancaire) {
        this.compteBancaire = compteBancaire;
    }

    public String getPositionActuelle() {
        return positionActuelle;
    }

    public void setPositionActuelle(String positionActuelle) {
        this.positionActuelle = positionActuelle;
    }

    /**
     * Calcule le score final.
     * Le score final est la moyenne des 5 autres scores.
     */
    public void calculateFinalScore() {
        this.finalScore = (this.scoreTransport + this.scoreEnergie + this.scoreAlimentation + this.nuisanceSonore + this.pollutionLumineuse)/5;
    }

    public int getBiodiversityProtectionScore() {
        return biodiversityProtectionScore;
    }

    public void setBiodiversityProtectionScore(int biodiversityProtectionScore) {
        this.biodiversityProtectionScore = biodiversityProtectionScore;
    }
}
