package com.example.models;



import javax.persistence.*;
import java.util.List;

@Entity
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String profile;

    @OneToMany(mappedBy = "parent")
    private List<Student> children;
}
