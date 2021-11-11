package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
    Integer insert(Product product);

    void update(Product product);

    List<Product> getAllProducts();

    Product getByProductId(Integer productId);
}
