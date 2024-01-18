package com.example.back_end.repository;

import com.example.back_end.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Vous pouvez ajouter d'autres méthodes de requête si nécessaire
}
