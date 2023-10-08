package com.example.assignment4.Model1;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    @NotBlank(message = "must have first name")
    private String firstName;
    @NotBlank(message = "must have")
    private String lastName;
    @ManyToOne
    private Department department;
}

