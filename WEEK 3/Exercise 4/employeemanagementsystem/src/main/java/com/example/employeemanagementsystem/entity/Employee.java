package com.example.employeemanagementsystem.entity;

import javax.persistence.*;

@Entity
@NamedQueries({
    @NamedQuery(
        name = "Employee.findByPosition",
        query = "SELECT e FROM Employee e WHERE e.position = :position"
    ),
    @NamedQuery(
        name = "Employee.findByEmailFragment",
        query = "SELECT e FROM Employee e WHERE e.email LIKE :emailFragment"
    )
})
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String position;

    // Getters and setters
}
