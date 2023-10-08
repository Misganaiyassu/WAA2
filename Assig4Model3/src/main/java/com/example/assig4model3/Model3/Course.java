package com.example.assig4model3.Model3;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer course_id;
    private String name;
    @ManyToMany(mappedBy="course")
    private List<Student> student=new ArrayList<>();
}
//3. Create a Bidirectional ManyToMany association between Student and Course using annotations.