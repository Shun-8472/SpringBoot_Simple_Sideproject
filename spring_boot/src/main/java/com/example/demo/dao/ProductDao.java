package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductDao {
    
    Integer insert(Product product);

    void update(Product product);

    Product getByProductId(Integer productId);

    List<Product> getAllProducts();
}
