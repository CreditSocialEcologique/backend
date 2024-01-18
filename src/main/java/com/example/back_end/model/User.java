package com.example.back_end.model;

import jakarta.persistence.*;

@Entity
@Table(name = "scores") // Assurez-vous que cela correspond à votre nom de table dans la base de données
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int scoreTransport;
    private int scoreEnergie;
    private int scoreAlimentation;
    private int nuisanceSonore;
    private int pollutionLumineuse;


    private String prenom;
    private String nom;
    private int age;

    private String dateNaissance;

    private String mobile;
    private String adresse;
    private String compteBancaire;
    private String positionActuelle;

    // Constructeur par défaut
    public User() {}

    // Getters et Setters pour tous les champs
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getScoreTransport() {
        return scoreTransport;
    }

    public void setScoreTransport(int scoreTransport) {
        this.scoreTransport = scoreTransport;
    }

    public int getScoreEnergie() {
        return scoreEnergie;
    }

    public void setScoreEnergie(int scoreEnergie) {
        this.scoreEnergie = scoreEnergie;
    }

    public int getScoreAlimentation() {
        return scoreAlimentation;
    }

    public void setScoreAlimentation(int scoreAlimentation) {
        this.scoreAlimentation = scoreAlimentation;
    }

    public int getNuisanceSonore() {
        return nuisanceSonore;
    }

    public void setNuisanceSonore(int nuisanceSonore) {
        this.nuisanceSonore = nuisanceSonore;
    }

    public int getPollutionLumineuse() {
        return pollutionLumineuse;
    }

    public void setPollutionLumineuse(int pollutionLumineuse) {
        this.pollutionLumineuse = pollutionLumineuse;
    }


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
}
