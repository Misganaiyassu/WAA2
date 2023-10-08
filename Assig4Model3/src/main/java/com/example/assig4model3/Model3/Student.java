package com.example.assig4model3.Model3;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer student_id;
    @NotBlank(message = "must fill")
    private String firstName;
    private String lastName;
    @ManyToMany
    private List<Course> course = new ArrayList<>();
}
