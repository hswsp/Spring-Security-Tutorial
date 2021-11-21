package com.example.security.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Permission implements Serializable {

    private static final long serialVersionUID = 7160557680614732403L;
    private Integer id;
    private String url;
    private String name;
}
