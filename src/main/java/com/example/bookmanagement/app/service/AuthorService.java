package com.example.bookmanagement.app.service;

import com.example.bookmanagement.app.entity.Author;
import com.example.bookmanagement.app.entity.AuthorRequest;
import com.example.bookmanagement.app.entity.AuthorResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {

    Author createAuthor(AuthorRequest authorRequest);

    List<Author> getAllAuthors();

    Author getAuthorById(Integer id);

    Author updateAuthor(AuthorRequest authorRequest, Integer id);

    void deleteAuthor(Integer id);

}
