package com.example.bookmanagement.app.service;

import com.example.bookmanagement.app.entity.Author;
import com.example.bookmanagement.app.entity.AuthorRequest;
import com.example.bookmanagement.app.entity.AuthorResponse;
import com.example.bookmanagement.app.exception.ResourceNotFoundException;
import com.example.bookmanagement.app.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository repository;

    @Override
    public Author createAuthor(AuthorRequest authorRequest) {
        return repository.save(Author.builder().email(authorRequest.getEmail())
                .birthDate(authorRequest.getBirthDate())
                .name(authorRequest.getName()).build());
    }

    @Override
    public List<Author> getAllAuthors() {
        return repository.findAll();
    }

    @Override
    public Author getAuthorById(Integer id) {
        Optional<Author> response = repository.findById(id);
        return response.orElseThrow();
    }

    @Override
    public Author updateAuthor(AuthorRequest authorRequest, Integer id) {
        Optional<Author> response = repository.findById(id);
        if(response.isPresent()){
            Author author = response.get();
            author.setId(author.getId());
            author.setName(authorRequest.getName());
            author.setEmail(authorRequest.getEmail());
            author.setBirthDate(authorRequest.getBirthDate());
            return author;
        } else {
          throw new ResourceNotFoundException("Record not found with id : "+ id);
        }
    }

    @Override
    public void deleteAuthor(Integer id) {
        Optional<Author> response = repository.findById(id);
        if(response.isPresent()){
            repository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("Record not found with id : "+ id);
        }
    }
}
