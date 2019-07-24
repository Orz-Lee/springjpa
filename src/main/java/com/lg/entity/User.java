package com.lg.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer age;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
