package com.example.models;


import javax.persistence.*;
import java.util.List;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "teacher")
    private List<Timetable> timetables;

    @OneToMany(mappedBy = "teacher")
    private List<Group> groups;
}
