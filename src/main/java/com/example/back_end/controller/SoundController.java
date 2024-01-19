package com.example.back_end.controller;

import com.example.back_end.model.BddScores;
import com.example.back_end.service.BddScoresService;;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class SoundController {

    @Autowired
    private BddScoresService bddScoresService;

    /**
     * Permet de réduire le score de nuisance sonore d'un utilisateur
     * @param id_user id de l'utilisateur
     * @return String "Data received" si tout s'est bien passé, "Error, user doesn't exist" si l'utilisateur n'existe pas
     */
    @PostMapping("/api/sound/reduceScore")
    public String receiveSoundData(@RequestParam(name="id_user") int id_user) {

        Optional<BddScores> user = bddScoresService.getScores(id_user);

        if(user.isEmpty()) {
            return "Error, user doesn't exist";
        }else {
            BddScores bddScores = user.get();
            bddScores.setNuisanceSonore(bddScores.getNuisanceSonore() - 1);
            bddScores.calculateFinalScore();
            bddScoresService.save(bddScores);
        }

        //Prnd le score sound et on le réduit de 1

        return "Data received";
    }
}
