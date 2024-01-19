package com.example.back_end.controller;

import com.example.back_end.model.BddScores;
import com.example.back_end.service.BddScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/scores")
public class BddScoresController {

    @Autowired
    private BddScoresService bddScoresService;

    /**
     * Update the final score of a user
     * @param id the id of the user
     * @return the updated user
     */
    @GetMapping("/update/{id}")
    public ResponseEntity<BddScores> updateFinalScore(@PathVariable Long id) {
        BddScores updatedScores = bddScoresService.updateFinalScore(id);
        return ResponseEntity.ok(updatedScores);
    }
}
