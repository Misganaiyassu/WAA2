package com.example.assig6model6.Model6;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer employee_id;
    private String name;
    @ManyToOne
    private Office office;
}
