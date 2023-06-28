package com.stribling.vogelhaus.Model;

import com.stribling.vogelhaus.Role.MemberRole;

import java.util.Date;

public class MemberModel {
    private Long id;
    private String name;
    private String userName;
    private String password;
    private MemberRole role;

    public MemberModel() {
    }

    public MemberModel(Long id, String name, String userName, String password, MemberRole role) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MemberRole getRole() {
        return role;
    }

    public void setRole(MemberRole role) {
        this.role = role;
    }
}
