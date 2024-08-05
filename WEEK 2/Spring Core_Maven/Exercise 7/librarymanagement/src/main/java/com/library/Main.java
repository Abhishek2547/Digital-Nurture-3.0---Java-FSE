package com.library;

import com.library.service.BookService;
import com.library.repository.BookRepository;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initialize Spring context
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve beans from the context
        BookService bookService = context.getBean(BookService.class);
        BookRepository bookRepository = context.getBean(BookRepository.class);

        // Print some information to verify that the beans are created
        System.out.println("BookService bean: " + bookService);
        System.out.println("BookRepository bean: " + bookRepository);

        // Call methods on your beans
        bookService.performService();
        bookRepository.performRepositoryAction();

        // Close the context
        context.close();
    }
}
