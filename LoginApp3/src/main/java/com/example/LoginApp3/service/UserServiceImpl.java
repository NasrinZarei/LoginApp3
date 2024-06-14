package com.example.LoginApp3.service;


import com.example.LoginApp3.entity.User;
import com.example.LoginApp3.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        List<User> temp = userRepository.findAll();
        return temp;
    }

    public User findOneByEmailAndPassword(String email, String password ){
        return userRepository.findOneByEmailAndPassword(email, password);
    }
}
