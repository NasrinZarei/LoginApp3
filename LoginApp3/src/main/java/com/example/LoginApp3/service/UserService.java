package com.example.LoginApp3.service;



import com.example.LoginApp3.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User create(User user);
    List<User> getAllUser();
    User findOneByEmailAndPassword(String email,String password);
}
