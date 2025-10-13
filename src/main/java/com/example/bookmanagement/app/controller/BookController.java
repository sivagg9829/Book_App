package com.example.bookmanagement.app.controller;

import com.example.bookmanagement.app.entity.BookRequest;
import com.example.bookmanagement.app.entity.BookResponse;
import com.example.bookmanagement.app.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class BookController {

    private final BookService bookService;

    @PostMapping(path="/api/books", produces = "application/json")
    public BookResponse createBook(BookRequest bookRequest){
        return bookService.createBook(bookRequest);
    }

    @GetMapping(path="/api/books", produces = "application/json")
    public BookResponse getAllBook(){
        return bookService.getAllBook();
    }

    @GetMapping(path="/api/books/{id}", produces = "application/json")
    public BookResponse getBookById(String id){
        return bookService.getBookById(id);
    }

    @PutMapping(path="/api/books/{id}", produces = "application/json")
    public BookResponse updateBook(BookRequest bookRequest, String id){
        return bookService.updateBook(bookRequest, id);
    }

    @DeleteMapping(path="/api/books", produces = "application/json")
    public BookResponse deleteBook(String id){
        return bookService.deleteBook(id);
    }

}
