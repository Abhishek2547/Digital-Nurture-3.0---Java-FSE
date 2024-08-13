package com.example.employeemanagementsystem.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.employeemanagementsystem.entity.Employee;
import org.springframework.data.domain.Sort;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Custom method to find employees with sorting
    Page<Employee> findAll(Pageable pageable);
    
    // Use this method if you want to find employees with sorting only
    List<Employee> findAll(Sort sort);
}
