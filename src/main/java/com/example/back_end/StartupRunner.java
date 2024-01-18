package com.example.back_end;

import com.example.back_end.service.BddScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

    @Autowired
    private BddScoresService bddScoresService;

    @Override
    public void run(String... args) {
        bddScoresService.updateFinalScoreForAll();
    }
}
