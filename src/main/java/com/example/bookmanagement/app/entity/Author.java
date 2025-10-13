package com.example.bookmanagement.app.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Builder
@Entity
@Table(name = "authors")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "birthdate")
    private Date birthDate;
}
