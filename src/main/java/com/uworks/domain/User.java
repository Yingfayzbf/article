package com.uworks.domain;

import org.hibernate.annotations.BatchSize;

import javax.persistence.*;

@Entity
@Table(name = "user")
@BatchSize(size = 20)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long        id;
    private String      name;
    private String      password;
    @Column(nullable = false, unique = true, length = 100)
    private String      mobile;

    public User() {
    }

    public User(long id, String name, String password, String mobile) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.mobile = mobile;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
