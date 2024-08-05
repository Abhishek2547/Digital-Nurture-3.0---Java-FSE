package com.library;

import com.library.service.BookService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initialize Spring context
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve beans from the context
        BookService bookService = context.getBean(BookService.class);

        // Call methods on your beans to trigger AOP advice
        bookService.performService();
        
        // Close the context
        context.close();
    }
}
