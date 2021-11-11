package com.example.demo.dao;

import com.example.demo.Entity.AddToCar;

import org.springframework.data.repository.CrudRepository;

public interface AddToCarDao extends CrudRepository<AddToCar, Integer>{
    
}
