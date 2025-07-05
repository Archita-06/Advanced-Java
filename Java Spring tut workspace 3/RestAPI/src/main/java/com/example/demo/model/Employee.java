package com.example.demo.model;

public class Employee {
    private int id;
    private String name;
    private String role;

    // Constructor
    public Employee(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    // Getters and setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }
}
