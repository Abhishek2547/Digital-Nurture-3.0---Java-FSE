package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    // Define custom query methods if needed
    Department findByName(String name);
}
