package com.stribling.vogelhaus.Entity;

import com.stribling.vogelhaus.Model.MemberModel;
import com.stribling.vogelhaus.Role.MemberRole;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String userName;
    private String password;
    @Enumerated(EnumType.STRING)
    private MemberRole role;

    public Member() {
    }

    public Member(MemberModel memberModel) {
        this.id = memberModel.getId();
        this.name = memberModel.getName();
        this.userName = memberModel.getUserName();
        this.password = memberModel.getPassword();
        this.role = memberModel.getRole();
    }

    public Long getId() {
        return id;
    }

    public void setId(MemberModel memberModel) {
        this.id = memberModel.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(MemberModel memberModel) {
        this.name = memberModel.getName();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(MemberModel memberModel) {
        this.userName = memberModel.getUserName();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(MemberModel memberModel) {
        this.password = memberModel.getPassword();
    }

    public MemberRole getRole() {
        return role;
    }

    public void setRole(MemberModel memberModel) {
        this.role = memberModel.getRole();
    }
}
