package com.example.assig4model4.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_id;
    @NotBlank(message = "must title")
    private String customer_name;
    @OneToMany
    @JoinTable(name="customer_reservation",joinColumns=@JoinColumn(name="customer_id")
            ,inverseJoinColumns=@JoinColumn(name="reservation_id"))
    private List<Reservation> reservation;
}
