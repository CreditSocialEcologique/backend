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

    @PostMapping("/calculate")
    public ResponseEntity<BddScores> calculateAndSavebddScores(@RequestBody BddScores bddScores) {
        BddScores savedScores = bddScoresService.saveBddScoresScore(bddScores);
        return ResponseEntity.ok(savedScores);
    }

    // Add more endpoints as needed
}
