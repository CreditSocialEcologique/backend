package com.example.back_end.service;

import com.example.back_end.model.User;
import com.example.back_end.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Récupère tous les utilisateurs
     * @return la liste de tous les utilisateurs
     */
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Récupère un utilisateur
     * @param id id de l'utilisateur
     * @return l'utilisateur
     */
    public User findUserById(long id) {
        return userRepository.findById(id).get();
    }

    /**
     * Enregistre un utilisateur
     * @param user utilisateur à enregistrer
     * @return l'utilisateur enregistré
     */
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
