package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> books = new ArrayList<>();

    // GET: Retrieve a list of all books
    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam(required = false) String title, 
                                  @RequestParam(required = false) String author) {
        return books.stream()
                    .filter(book -> (title == null || book.getTitle().equalsIgnoreCase(title)) &&
                                    (author == null || book.getAuthor().equalsIgnoreCase(author)))
                    .toList();
    }
    

    // GET: Retrieve a specific book by ID
    @GetMapping("/{id}")
        public Book getBookById(@PathVariable int id) {
            return books.stream().filter(book -> book.getId() == id).findFirst().orElse(null);
    }


    // POST: Add a new book
    @PostMapping
    public void addBook(@RequestBody Book book) {
        books.add(book);
    }

    // PUT: Update an existing book
    @PutMapping("/{id}")
    public void updateBook(@PathVariable int id, @RequestBody Book updatedBook) {
        books.stream().filter(book -> book.getId() == id).forEach(book -> {
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setPrice(updatedBook.getPrice());
            book.setIsbn(updatedBook.getIsbn());
        });
    }

    // DELETE: Remove a book by ID
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {
        books.removeIf(book -> book.getId() == id);
    }
}
