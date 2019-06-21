package com.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private String password;

    private String role;

    private Date createAt;

    private String createBy;

    public User(Integer id, String name, String password, String role, Date createAt, String createBy) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
        this.createAt = createAt;
        this.createBy = createBy;
    }

    public User() {
        super();
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
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }
}