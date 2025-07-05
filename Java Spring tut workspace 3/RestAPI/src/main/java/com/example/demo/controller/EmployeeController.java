package com.example.demo.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    List<Employee> employees = new ArrayList<>();

    // Constructor to add dummy data
    public EmployeeController() {
        employees.add(new Employee(1, "Alice", "Developer"));
        employees.add(new Employee(2, "Bob", "Manager"));
    }

    // GET all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // GET employee by ID
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    // POST: Add a new employee
    @PostMapping
    public Employee addEmployee(@RequestBody Employee emp) {
        employees.add(emp);
        return emp;
    }

    // PUT: Update an employee
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmp) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setName(updatedEmp.getName());
                emp.setRole(updatedEmp.getRole());
                return emp;
            }
        }
        return null;
    }

    // DELETE: Remove an employee
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employees.removeIf(e -> e.getId() == id);
        return "Employee removed";
    }
}
