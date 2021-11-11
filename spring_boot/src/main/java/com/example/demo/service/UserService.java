package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
    
    Integer insert(User user);

    void update(User user);

    List<User> getAllUsers();

    User getByUserId(Integer userId);
}
