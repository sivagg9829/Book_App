package com.example.bookmanagement.app.controller;

import com.example.bookmanagement.app.entity.AllAuthors;
import com.example.bookmanagement.app.entity.Author;
import com.example.bookmanagement.app.entity.AuthorRequest;
import com.example.bookmanagement.app.entity.AuthorResponse;
import com.example.bookmanagement.app.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class AuthorController {

    public final AuthorService authorService;

    @PostMapping(path="/api/authors", produces = "application/json")
    public ResponseEntity<Author> createAuthor(AuthorRequest authorRequest){
        return ResponseEntity.ok().body(authorService.createAuthor(authorRequest));
    }

    @GetMapping(path="/api/authors", produces = "application/json")
    public ResponseEntity<List<Author>> getAllAuthors(){
        return ResponseEntity.ok().body(authorService.getAllAuthors());
    }

    @GetMapping(path="/api/authors/{id}", produces = "application/json")
    public ResponseEntity<Author> createAuthor(Integer id){
        return ResponseEntity.ok().body(authorService.getAuthorById(id));
    }

    @PutMapping(path="/api/authors/{id}", produces = "application/json")
    public ResponseEntity<Author> updateAuthor(AuthorRequest authorRequest, Integer id){
        return ResponseEntity.ok().body(authorService.updateAuthor(authorRequest, id));
    }

    @DeleteMapping(path="/api/authors", produces = "application/json")
    public HttpStatus deleteAuthor(Integer id){
        authorService.deleteAuthor(id);
        return HttpStatus.OK;
    }

}
