package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private List<Customer> customers = new ArrayList<>();

    // POST: Register a new customer using form data
    @PostMapping("/register")
    public void registerCustomer(@RequestParam int id,
                                @RequestParam String name,
                                @RequestParam String email,
                                @RequestParam String address) {
        Customer customer = new Customer(id, name, email, address);
        customers.add(customer);
    }


    // GET: Retrieve all customers (for testing)
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customers;
    }
}
