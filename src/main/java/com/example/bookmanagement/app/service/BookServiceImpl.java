package com.example.bookmanagement.app.service;

import com.example.bookmanagement.app.entity.Author;
import com.example.bookmanagement.app.entity.BookRequest;
import com.example.bookmanagement.app.entity.BookResponse;
import com.example.bookmanagement.app.entity.Books;
import com.example.bookmanagement.app.exception.ResourceNotFoundException;
import com.example.bookmanagement.app.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class BookServiceImpl implements BookService{

    private final BookRepository repository;

    @Override
    public Books createBook(BookRequest bookRequest) {
        return repository.save(Books.builder()
                .title(bookRequest.getTitle())
                .price(bookRequest.getPrice())
                .isbn(bookRequest.getIsbn())
                .publishedDate(bookRequest.getPublishedDate())
                .authorId(bookRequest.getAuthorId())
                .build());
    }

    @Override
    public List<Books> getAllBook() {
        return repository.findAll();
    }

    @Override
    public Books getBookById(Integer id) {
        Optional<Books> response = repository.findById(id);
        return response.orElseThrow();
    }

    @Override
    public Books updateBook(BookRequest bookRequest, Integer id) {
        Optional<Books> response = repository.findById(id);
        if(response.isPresent()){
            Books book = response.get();
            book.setId(book.getId());
            book.setTitle(bookRequest.getTitle());
            book.setIsbn(bookRequest.getIsbn());
            book.setPublishedDate(bookRequest.getPublishedDate());
            book.setPrice(bookRequest.getPrice());
            book.setAuthorId(bookRequest.getAuthorId());
            return repository.save(book);
        } else {
            throw new ResourceNotFoundException("Record not found with id : "+ id);
        }
    }

    @Override
    public void deleteBook(Integer id) {
        Optional<Books> response = repository.findById(id);
        if(response.isPresent()){
            repository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("Record not found with id : "+ id);
        }
    }
}
