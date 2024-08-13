package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(name = "Employee.findByPosition")
    List<Employee> findEmployeesByNamedPosition(@Param("position") String position);

    @Query(name = "Employee.findByEmailFragment")
    List<Employee> findEmployeesByNamedEmailFragment(@Param("emailFragment") String emailFragment);
}

