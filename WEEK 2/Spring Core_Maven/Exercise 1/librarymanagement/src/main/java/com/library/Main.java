package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class Main {
    public static void main(String[] args) {
        // Load the Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        try {
            // Retrieve the BookService bean
            BookService bookService = (BookService) context.getBean("bookService");
            
            // Use the BookService
            bookService.addBook("The Great Gatsby");
        } finally {
            // Close the context to release resources
            ((ClassPathXmlApplicationContext) context).close();
        }
    }
}
