package com.example.back_end.controller;

import com.example.back_end.model.BddScores;
import com.example.back_end.service.BddScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class LightController {

    @Autowired
    private BddScoresService bddScoresService;

    /**
     * Permet de réduire le score de pollution lumineuse d'un utilisateur
     * @param id_user id de l'utilisateur
     * @return String "Data received" si tout s'est bien passé, "Error, user doesn't exist" si l'utilisateur n'existe pas
     */
    @PostMapping("/api/light/reduceScore")
    public String receiveLightData(@RequestParam(name="id_user") int id_user) {

        Optional<BddScores> user = bddScoresService.getScores(id_user);

        if(user.isEmpty()) {
            return "Error, user doesn't exist";
        } else {
            BddScores bddScores = user.get();
            bddScores.setPollutionLumineuse(bddScores.getPollutionLumineuse() - 1);
            bddScores.calculateFinalScore();
            bddScoresService.save(bddScores);
        }

        // Réduit le score de pollution lumineuse de 1

        return "Data received";
    }
}
