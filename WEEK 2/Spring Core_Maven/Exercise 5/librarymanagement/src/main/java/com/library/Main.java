package com.library;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class Main {
    public static void main(String[] args) {
        // Load the Spring context from the applicationContext.xml file
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        try {
            // Retrieve the bookService bean from the context
            BookService bookService = (BookService) context.getBean("bookService");

            // Test the configuration by calling methods on the bookService
            bookService.performSomeService();
            
            // Use the addBook method to save a book
            bookService.addBook("Spring in Action");
        } finally {
            // Close the context to release resources
            context.close();
        }
    }
}
