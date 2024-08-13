// EmployeeDTO.java
package com.example.employeemanagementsystem.dto;

public class EmployeeDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String departmentName;

    public EmployeeDTO(Long id, String firstName, String lastName, String departmentName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
    }

    // Getters and setters
}
