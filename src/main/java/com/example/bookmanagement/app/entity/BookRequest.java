package com.example.bookmanagement.app.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BookRequest implements Serializable {

    private String title;

    private String isbn;

    private Date publishedDate;

    private double price;

    private long authorId;
}
