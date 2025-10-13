package com.example.bookmanagement.app.service;

import com.example.bookmanagement.app.entity.BookRequest;
import com.example.bookmanagement.app.entity.BookResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class BookServiceImpl implements BookService{

    @Override
    public BookResponse createBook(BookRequest authorRequest) {
        return null;
    }

    @Override
    public BookResponse getAllBook() {
        return null;
    }

    @Override
    public BookResponse getBookById(String id) {
        return null;
    }

    @Override
    public BookResponse updateBook(BookRequest authorRequest, String id) {
        return null;
    }

    @Override
    public BookResponse deleteBook(String id) {
        return null;
    }
}
