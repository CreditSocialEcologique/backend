package com.example.back_end.controller;

import com.example.back_end.model.LitteringIncident;
import com.example.back_end.model.sound;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoundController {

    @PostMapping("/api/sound-level")
    public String receiveSoundData(@RequestBody sound soundData) {
        // Process the data
        processSoundData(soundData);

        return "Data received";
    }

    private void processSoundData( sound soundData) {
        // Implement your logic here
        double volume = soundData.getVolume();
        // Example: print out the volume
        System.out.println("Received volume: " + volume);

        // Add your existing logic to process the volume data
    }
}
