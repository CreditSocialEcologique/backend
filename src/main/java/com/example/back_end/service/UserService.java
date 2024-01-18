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

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User findUserById(long id) {
        return userRepository.findById(id).get();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
