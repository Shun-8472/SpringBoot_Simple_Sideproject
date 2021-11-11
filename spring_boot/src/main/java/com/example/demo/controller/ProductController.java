package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public ResponseEntity<Product> create(@RequestBody Product product) {
        Integer productId = productService.insert(product);
        Product newProduct = productService.getByProductId(productId);

        return ResponseEntity.status(HttpStatus.CREATED).body(newProduct);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> read() {
        return ResponseEntity.status(HttpStatus.OK).body(productService.getAllProducts());
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> read(@PathVariable Integer productId) {

        Product user = productService.getByProductId(productId);

        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
