package com.example.assig4model2.Model2;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer book_id;
    private String isbn;
    private String title;
    private String Autore;
    @ManyToOne
    @JoinTable(name="Book_Publisher",
    joinColumns={@JoinColumn(name="publisher_id")},
    inverseJoinColumns={@JoinColumn(name="book_id")})
    private Publisher publisher;
}
