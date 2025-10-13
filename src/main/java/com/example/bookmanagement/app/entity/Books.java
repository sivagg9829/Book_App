package com.example.bookmanagement.app.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Books {

    private Integer id;

    private String title;

    private String isbn;

    private Date publishedDate;

    private double price;

    private Integer authorId;
}
