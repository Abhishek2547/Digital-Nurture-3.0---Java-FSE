// DepartmentDTO.java
package com.example.employeemanagementsystem.dto;

public class DepartmentDTO {
    private Long id;
    private String name;
    private String headOfDepartment;

    public DepartmentDTO(Long id, String name, String headOfDepartment) {
        this.id = id;
        this.name = name;
        this.headOfDepartment = headOfDepartment;
    }

    // Getters and setters
}
