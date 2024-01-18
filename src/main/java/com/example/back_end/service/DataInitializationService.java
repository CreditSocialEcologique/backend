package com.example.back_end.service;

import com.example.back_end.model.BddScores;
import com.example.back_end.repository.BddScoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class DataInitializationService {

    @Autowired
    private BddScoresRepository bddScoresRepository;

    // Liste de villes françaises
    private final String[] villes = {"Paris", "Marseille", "Lyon", "Toulouse", "Nice", "Nantes", "Strasbourg", "Montpellier", "Bordeaux", "Lille"};

    private static final String[] prenoms = {
            "Roger", "Fabre", "Aubert", "Lemoine", "Renaud", "Dumas", "Lacroix", "Olivier", "Philippe", "Bourgeois",
            "Pierre", "Benoit", "Rey", "Leclerc", "Payet", "Rolland", "Leclercq", "Guillaume", "Lecomte", "Lopez",
            "Jean", "Dupuy", "Guillot", "Hubert", "Berger", "Carpentier", "Sanchez", "Dupuis", "Moulin", "Louis",
            "Deschamps", "Huet", "Vasseur", "Perez", "Boucher", "Fleury", "Royer", "Klein", "Jacquet", "Adam", "Paris",
            "Poirier", "Marty", "Aubry", "Guyot", "Carre", "Charles", "Renault", "Charpentier", "Menard", "Maillard",
            "Baron", "Bertin", "Bailly", "Herve", "Schneider", "Fernandez", "Le Gall", "Collet", "Leger", "Bouvier",
            "Julien", "Prevost", "Millet", "Perrot", "Daniel", "Le Roux", "Cousin", "Germain", "Breton", "Besson",
            "Langlois", "Remy", "Le Goff", "Pelletier", "Leveque", "Perrier", "Leblanc", "Barre", "Lebrun", "Marchal",
            "Weber", "Mallet", "Hamon", "Boulanger", "Jacob", "Monnier", "Michaud", "Rodriguez", "Guichard", "Gillet",
            "Etienne", "Grondin", "Poulain", "Tessier", "Chevallier", "Collin", "Chauvin", "Da Silva", "Bouchet",
            "Gay", "Lemaitre", "Benard", "Marechal", "Humbert", "Reynaud", "Antoine", "Hoarau", "Perret", "Barthelemy",
            "Cordier", "Pichon", "Lejeune", "Gilbert", "Lamy", "Delaunay", "Pasquier", "Carlier", "Laporte"
    };

    private static final List<String> NOMS = Arrays.asList(
            "Martin", "Bernard", "Thomas", "Petit", "Robert",
            "Richard", "Durand", "Dubois", "Moreau", "Laurent",
            "Simon", "Michel", "Lefebvre", "Leroy", "Roux",
            "David", "Bertrand", "Morel", "Fournier", "Girard",
            "Bonnet", "Dupont", "Lambert", "Fontaine", "Rousseau",
            "Vincent", "Muller", "Lefevre", "Faure", "Andre",
            "Mercier", "Blanc", "Guerin", "Boyer", "Garnier",
            "Chevalier", "Francois", "Legrand", "Gauthier", "Garcia",
            "Perrin", "Robin", "Clement", "Morin", "Nicolas",
            "Henry", "Roussel", "Mathieu", "Gautier", "Masson",
            "Marchand", "Duval", "Denis", "Dumont", "Marie",
            "Lemaire", "Noel", "Meyer", "Dufour", "Meunier",
            "Brun", "Blanchard", "Giraud", "Joly", "Riviere",
            "Lucas", "Brunet", "Gaillard", "Barbier", "Arnaud",
            "Martinez", "Gerard", "Roche", "Renard", "Schmitt",
            "Roy", "Leroux", "Colin", "Vidal", "Caron",
            "Picard", "Roger", "Fabre", "Aubert", "Lemoine",
            "Renaud", "Dumas", "Lacroix", "Olivier", "Philippe",
            "Bourgeois", "Pierre", "Benoit", "Rey", "Leclerc",
            "Payet", "Rolland", "Leclercq", "Guillaume", "Lecomte"
    );

    private static final String[] banques = {
            "société générale", "bnp paribas", "LCL", "banque postale", "crédit agricole"
    };


    private static final String[] datesNaissance = {
            "01-01-1980", "15-06-1990", "05-03-1975", "20-11-1988", "10-09-1995", "25-12-1982", "30-07-1993", "18-04-1987", "08-10-1992", "12-09-1984"

    };

    @PostConstruct
    public void initializeData() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            BddScores bddScores = new BddScores();
            bddScores.setScoreTransport(random.nextInt(401) + 600);
            bddScores.setScoreEnergie(random.nextInt(401) + 600);
            bddScores.setScoreAlimentation(random.nextInt(401) + 600);
            bddScores.setNuisanceSonore(random.nextInt(401) + 600);
            bddScores.setPollutionLumineuse(random.nextInt(401) + 600);
            bddScores.setFinalScore(0);
            bddScores.setPrenom(getRandomPrenom());
            String nomAleatoire = NOMS.get(random.nextInt(NOMS.size()));
            bddScores.setNom(nomAleatoire);
            bddScores.setAge(random.nextInt(60) + 18);
            bddScores.setDateNaissance(getRandomDateOfBirth());
            bddScores.setMobile("+33 (0) 6" + String.format("%08d", random.nextInt(100000000)));
            bddScores.setAdresse(random.nextInt(100) + " RUE DU MATUIDI CHARO, " + getRandomVille());
            bddScores.setPositionActuelle(getRandomVille());
            bddScores.setCompteBancaire(getBankAcc());

            bddScoresRepository.save(bddScores);
        }
    }

    private String getRandomVille() {
        Random random = new Random();
        return villes[random.nextInt(villes.length)];
    }

    private String getRandomPrenom() {
        Random random = new Random();
        int index = random.nextInt(prenoms.length);
        return prenoms[index];
    }

    private String getRandomDateOfBirth() {
        Random random = new Random();
        int index = random.nextInt(datesNaissance.length);
        return datesNaissance[index];
    }

    private String getBankAcc() {
        Random random = new Random();
        int index = random.nextInt(banques.length);
        return banques[index];
    }

}

