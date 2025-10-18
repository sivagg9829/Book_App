package com.example.bookmanagement.app.controller;

import com.example.bookmanagement.app.entity.BookRequest;
import com.example.bookmanagement.app.entity.Books;
import com.example.bookmanagement.app.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class BookController {

    private final BookService bookService;

    @PostMapping(path="/api/books", produces = "application/json")
    public ResponseEntity<Books> createBook(@RequestBody BookRequest bookRequest){
        return ResponseEntity.ok().body(bookService.createBook(bookRequest));
    }

    @GetMapping(path="/api/books", produces = "application/json")
    public ResponseEntity<List<Books>> getAllBook(){
        return ResponseEntity.ok().body(bookService.getAllBook());
    }

    @GetMapping(path="/api/books/{id}", produces = "application/json")
    public ResponseEntity<Books> getBookById(@PathVariable Integer id){
        return ResponseEntity.ok().body(bookService.getBookById(id));
    }

    @PutMapping(path="/api/books/{id}", produces = "application/json")
    public ResponseEntity<Books> updateBook(@RequestBody BookRequest bookRequest, @PathVariable Integer id){
        return ResponseEntity.ok().body(bookService.updateBook(bookRequest, id));
    }

    @DeleteMapping(path="/api/books/{id}", produces = "application/json")
    public HttpStatus deleteBook(@PathVariable Integer id){
        bookService.deleteBook(id);
        return HttpStatus.OK;
    }

}
