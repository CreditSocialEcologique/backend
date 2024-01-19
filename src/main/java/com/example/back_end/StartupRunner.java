package com.example.back_end;

import com.example.back_end.service.BddScoresService;
import com.example.back_end.service.DataInitializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

    @Autowired
    private BddScoresService bddScoresService;

    @Autowired
    private DataInitializationService dataInitializationService;

    /**
     * Méthode appelée au démarrage de l'application pour initialiser les données et mettre à jour les scores
     * @param args arguments
     */
    @Override
    public void run(String... args) {
        dataInitializationService.initializeData();
        bddScoresService.updateFinalScoreForAll();
    }
}
