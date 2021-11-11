package com.example.demo.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.mapper.ProductRowMapper;
import com.example.demo.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

@Component
public class ProductDaoImpl implements ProductDao{

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    
    @Override
    public Integer insert(Product product) {
        // TODO Auto-generated method stub
        String sql = "INSERT INTO product(name, price, img, description, state, insert_time, update_time) VALUES (:name, :price, :img, :description, :state, :insert_time, :update_time)";
        
        Map<String, Object> map = new HashMap<>();
        map.put("name", product.getName());
        map.put("price", product.getPrice());
        map.put("img", product.getImg());
        map.put("description", product.getDescription());
        map.put("state", product.getState());
        map.put("insert_time", new Date());
        map.put("update_time", new Date());
        
        KeyHolder keyHolder = new GeneratedKeyHolder();

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(map), keyHolder);

        int id = keyHolder.getKey().intValue();
        System.out.println("mysql 自動生成的 id 為: " + id);

        return id;
    }

    @Override
    public void update(Product product) {
        // TODO Auto-generated method stub
        String sql = "UPDATE product SET name = :name, price = :price, img = :img, description = :description, state = :state, update_time = :update_time WHERE id = :id";

        Map<String, Object> map = new HashMap<>();
        map.put("name", product.getName());
        map.put("price", product.getPrice());
        map.put("img", product.getImg());
        map.put("description", product.getDescription());
        map.put("state", product.getState());
        map.put("update_time", new Date());

        namedParameterJdbcTemplate.update(sql, map);
    }

    @Override
    public Product getByProductId(Integer productId) {
        // TODO Auto-generated method stub
        String sql = "SELECT pid, name, price, img, description, state, insert_time, update_time FROM product WHERE pid = :pid";

        Map<String, Object> map = new HashMap<>();
        map.put("pid", productId);

        List<Product> list = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());

        if (list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<Product> getAllProducts() {
        // TODO Auto-generated method stub
        String sql = "SELECT pid, name, price, img, description, state, insert_time, update_time FROM product";

        Map<String, Object> map = new HashMap<>();
        List<Product> list = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());

        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
    
}
