package com.example.bookmanagement.app.service;

import com.example.bookmanagement.app.entity.Author;
import com.example.bookmanagement.app.entity.AuthorRequest;
import com.example.bookmanagement.app.entity.AuthorResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {

    public Author createAuthor(AuthorRequest authorRequest);

    public List<Author> getAllAuthors();

    public Author getAuthorById(Integer id);

    public Author updateAuthor(AuthorRequest authorRequest, Integer id);

    public void deleteAuthor(Integer id);

}
