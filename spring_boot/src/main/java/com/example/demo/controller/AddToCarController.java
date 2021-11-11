package com.example.demo.controller;

import java.util.Optional;

import com.example.demo.Entity.AddToCar;
import com.example.demo.service.AddToCarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AddToCarController {
    
    @Autowired
    AddToCarService addToCarService;

    @GetMapping("/addToCars")
    public ResponseEntity<Iterable<AddToCar>> read() {
        return ResponseEntity.status(HttpStatus.OK).body(addToCarService.getAddToCarList());
    }

    @GetMapping("/addToCars/{addToCarsId}")
    public ResponseEntity<Optional<AddToCar>> getById(@PathVariable Integer addToCarsId) {
        return ResponseEntity.status(HttpStatus.OK).body(addToCarService.getAddToCarById(addToCarsId));
    }

}
