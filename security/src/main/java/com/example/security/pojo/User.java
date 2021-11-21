package com.example.security.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
@NoArgsConstructor
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -5440372534300871944L;

    private Integer id;
    private String userName;
    private String password;
    private Date createTime;
    private String status;
    private Set<String> role;

    private Set<String> permission;

    public User(String username, String password, Set<String> role, Set<String> permission) {
        this.userName = username;
        this.password = password;
        this.role = role;
        this.permission = permission;
    }

}

