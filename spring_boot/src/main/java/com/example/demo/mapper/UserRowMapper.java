package com.example.demo.mapper;

import com.example.demo.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setUid(resultSet.getInt("uid"));
        user.setName(resultSet.getString("name"));
        user.setPassword(resultSet.getString("password"));
        user.setRole(resultSet.getString("role"));
        user.setInsertTime(resultSet.getTimestamp("insert_time"));
        user.setUpdateTime(resultSet.getTimestamp("update_time"));

        return user;
    }
}
