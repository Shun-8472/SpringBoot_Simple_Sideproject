package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    Integer pid;
    @Column
    String name;

    public Integer getPid() {
        return this.pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
