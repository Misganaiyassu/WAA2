package com.example.assignment4.Model1;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departmentId;
    @NotBlank(message = "must have")
    private String address;
    private String departmentType;
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}