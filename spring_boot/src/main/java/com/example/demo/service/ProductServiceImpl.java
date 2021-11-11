package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.ProductDao;
import com.example.demo.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public Integer insert(Product product) {
        // TODO Auto-generated method stub
        return productDao.insert(product);
    }

    @Override
    public void update(Product product) {
        // TODO Auto-generated method stub
        productDao.update(product);
    }

    @Override
    public List<Product> getAllProducts() {
        // TODO Auto-generated method stub
        return productDao.getAllProducts();
    }

    @Override
    public Product getByProductId(Integer productId) {
        // TODO Auto-generated method stub
        return productDao.getByProductId(productId);
    }
    
}
