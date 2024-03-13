package com.example.hibernateonspringboot.entities;

import jakarta.persistence.*;

@Entity
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "studentID", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "classID", nullable = false)
    private Class classP;
}

