package com.example.demo.service;

import java.util.Optional;

import com.example.demo.Entity.AddToCar;
import com.example.demo.dao.AddToCarDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddToCarService {
    
    @Autowired
    AddToCarDao addToCarDao;

    public Iterable<AddToCar> getAddToCarList() {
        return addToCarDao.findAll();
    }

    public Optional<AddToCar> getAddToCarById(Integer id) {
        return addToCarDao.findById(id);
    }
}
