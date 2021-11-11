package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public Integer insert(User user) {
        // TODO Auto-generated method stub
        return userDao.insert(user);
    }

    @Override
    public void update(User user) {
        // TODO Auto-generated method stub
        userDao.update(user);
    }

    @Override
    public List<User> getAllUsers() {
        // TODO Auto-generated method stub
        return userDao.getAllUsers();
    }

    @Override
    public User getByUserId(Integer userId) {
        // TODO Auto-generated method stub
        return userDao.getByUserId(userId);
    }
    
}
