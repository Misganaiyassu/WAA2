package com.example.assig6model6.Model6;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer office_id;
    private String office_name;
    @OneToMany(mappedBy = "office")
    private List<Employee> employee= new ArrayList<>();

}
