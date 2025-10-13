package com.example.bookmanagement.app.entity;

import lombok.Data;

import java.util.Date;

@Data
public class AuthorRequest {

    private Integer id;

    private String name;

    private String email;

    private Date birthDate;
}
