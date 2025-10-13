package com.example.bookmanagement.app.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class AllAuthors implements Serializable {

    private Integer id;

    private String name;

    private String email;

    private Date birthDate;

    private List<Books> books;
}
