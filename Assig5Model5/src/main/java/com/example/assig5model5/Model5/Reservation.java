package com.example.assig5model5.Model5;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reservation_id;
    private Date startDate;
    private Date endDate;
    @ManyToOne
    @JoinTable(name="reservation_book", joinColumns = {@JoinColumn(name="book_id")},
    inverseJoinColumns = {@JoinColumn(name="reservation_id")})
    private Book book;
}
