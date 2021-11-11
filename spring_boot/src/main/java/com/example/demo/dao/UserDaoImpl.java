package com.example.demo.dao;

import com.example.demo.mapper.UserRowMapper;
import com.example.demo.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Integer insert(User user) {
        // TODO Auto-generated method stub
        String sql = "INSERT INTO user(name, password, role, insert_time, update_time) VALUES (:name, :password, :role, :insert_time, :update_time)";

        Map<String, Object> map = new HashMap<>();
        map.put("name", user.getName());
        map.put("password", user.getPassword());
        map.put("role", user.getRole());
        map.put("insert_time", new Date());
        map.put("update_time", new Date());

        KeyHolder keyHolder = new GeneratedKeyHolder();

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(map), keyHolder);

        int id = keyHolder.getKey().intValue();
        System.out.println("mysql 自動生成的 id 為: " + id);

        return id;
    }

    @Override
    public void update(User user) {
        // TODO Auto-generated method stub
        String sql = "UPDATE user SET name = :name, password =: password, role = :role, update_date = :update_date WHERE id = :id";

        Map<String, Object> map = new HashMap<>();
        map.put("id", user.getUid());
        map.put("name", user.getName());
        map.put("role", user.getRole());
        map.put("update_date", new Date());

        namedParameterJdbcTemplate.update(sql, map);
    }

    @Override
    public User getByUserId(Integer userId) {
        // TODO Auto-generated method stub
        String sql = "SELECT uid, name, password, role, insert_time, update_time FROM user WHERE uid = :uid";

        Map<String, Object> map = new HashMap<>();
        map.put("uid", userId);

        List<User> list = namedParameterJdbcTemplate.query(sql, map, new UserRowMapper());

        if (list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }
    
    @Override
    public List<User> getAllUsers(){
        String sql = "SELECT uid, name, password, role, insert_time, update_time FROM user";

        Map<String, Object> map = new HashMap<>();
        List<User> list = namedParameterJdbcTemplate.query(sql, map, new UserRowMapper());

        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
}
