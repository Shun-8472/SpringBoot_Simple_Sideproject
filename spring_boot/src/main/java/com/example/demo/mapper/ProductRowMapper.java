package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.demo.model.Product;

import org.springframework.jdbc.core.RowMapper;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setPid(resultSet.getInt("pid"));
        product.setName(resultSet.getString("name"));
        product.setPrice(resultSet.getInt("price"));
        product.setImg(resultSet.getString("img"));
        product.setDescription(resultSet.getString("description"));
        product.setState(resultSet.getString("state"));
        product.setInsert_time(resultSet.getTimestamp("insert_time"));
        product.setUpdate_time(resultSet.getTimestamp("update_time"));

        return product;
    }
}
