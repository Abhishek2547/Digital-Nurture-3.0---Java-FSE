package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Method to add a book using BookRepository
    public void addBook(String book) {
        bookRepository.saveBook(book);
    }

    // Other methods for book service logic
    public void performSomeService() {
        // Example logic
        System.out.println("BookService is using BookRepository");
    }
}
