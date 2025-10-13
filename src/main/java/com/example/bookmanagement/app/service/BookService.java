package com.example.bookmanagement.app.service;

import com.example.bookmanagement.app.entity.BookRequest;
import com.example.bookmanagement.app.entity.BookResponse;
import com.example.bookmanagement.app.entity.Books;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    Books createBook(BookRequest bookRequest);

    List<Books> getAllBook();

    Books getBookById(Integer id);

    Books updateBook(BookRequest bookRequest, Integer id);

    void deleteBook(Integer id);

}
