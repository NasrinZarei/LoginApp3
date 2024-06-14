package com.example.LoginApp3.repository;

import com.example.LoginApp3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findOneByEmailAndPassword(String email, String password);
}
