package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.example.demo.dao.ProductDao;
import com.example.demo.model.Product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductServiceMockTest {
    
    @Autowired
    private ProductDao productDao;

    @Test
    public void getById() {
        Product product = productDao.getByProductId(1);

        assertNotNull(product);
        assertEquals(1, product.getPid());
        assertEquals("Admin", product.getName());
    }
}
