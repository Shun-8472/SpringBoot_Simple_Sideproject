package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceImplMockTest {
    
    @Autowired
    private UserDao userDao;

    @Test
    public void getById() {
        User user = userDao.getByUserId(1);

        assertNotNull(user);
        assertEquals(1, user.getUid());
        assertEquals("Admin", user.getName());
    }
}