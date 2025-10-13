package com.example.bookmanagement.app.service;

import com.example.bookmanagement.app.entity.BookRequest;
import com.example.bookmanagement.app.entity.BookResponse;
import org.springframework.stereotype.Service;

@Service
public interface BookService {

    BookResponse createBook(BookRequest bookRequest);

    BookResponse getAllBook();

    BookResponse getBookById(String id);

    BookResponse updateBook(BookRequest bookRequest, String id);

    BookResponse deleteBook(String id);

}
