package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.User;

public interface UserDao {

    Integer insert(User user);

    void update(User user);

    User getByUserId(Integer userId);

    List<User> getAllUsers();
}
