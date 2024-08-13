package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.entity.Employee;
import com.example.employeemanagementsystem.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void batchUpdateSalaries(List<Employee> employees) {
        for (Employee employee : employees) {
            double newSalary = employee.getSalary() * 1.1; // Increase salary by 10%
            employee.setSalary(newSalary);
            employeeRepository.save(employee);
        }
    }
}
