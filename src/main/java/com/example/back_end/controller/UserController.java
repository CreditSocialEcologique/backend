package com.example.back_end.controller;

import com.example.back_end.model.BddScores;
import com.example.back_end.model.User;
import com.example.back_end.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.findAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.findUserById(id);
        return ResponseEntity.ok(user);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User newUser, @PathVariable Long id) {
        User updatedUser = userService.findUserById(id);
        updatedUser.setAdresse(newUser.getAdresse());
        updatedUser.setAge(newUser.getAge());
        updatedUser.setNom(newUser.getNom());
        updatedUser.setPrenom(newUser.getPrenom());
        updatedUser.setCompteBancaire(newUser.getCompteBancaire());
        updatedUser.setDateNaissance(newUser.getDateNaissance());
        updatedUser.setMobile(newUser.getMobile());
        updatedUser.setNuisanceSonore(newUser.getNuisanceSonore());
        updatedUser.setPollutionLumineuse(newUser.getPollutionLumineuse());
        updatedUser.setPositionActuelle(newUser.getPositionActuelle());
        updatedUser.setScoreAlimentation(newUser.getScoreAlimentation());
        updatedUser.setScoreEnergie(newUser.getScoreEnergie());
        updatedUser.setScoreTransport(newUser.getScoreTransport());
        userService.saveUser(updatedUser);
        return ResponseEntity.ok(updatedUser);
    }
}
