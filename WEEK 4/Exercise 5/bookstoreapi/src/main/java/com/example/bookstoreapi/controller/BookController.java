package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.model.Book;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> books = new ArrayList<>();

    // POST: Create a new book with custom headers
    @PostMapping
    public ResponseEntity<String> createBook(@RequestBody Book book) {
        books.add(book);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "HeaderValue");

        return new ResponseEntity<>("Book created successfully", headers, HttpStatus.CREATED);
    }

    // GET: Retrieve a book by ID with custom headers
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id) {
        Book book = books.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException(id));

        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "HeaderValue");

        return new ResponseEntity<>(book, headers, HttpStatus.OK);
    }

    // Custom Exception Handling for Book Not Found
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public static class BookNotFoundException extends RuntimeException {
        public BookNotFoundException(int id) {
            super("Book not found with ID: " + id);
        }
    }
}
