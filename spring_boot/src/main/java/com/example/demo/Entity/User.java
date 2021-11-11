package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    
    @Id
    Integer uid;
    @Column
    String name;

    public Integer getUid() {
        return this.uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
