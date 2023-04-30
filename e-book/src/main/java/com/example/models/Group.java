package com.example.models;


import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "group_t")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant entered_date;

    @OneToMany(mappedBy = "group")
    private List<Student> students;

    @ManyToOne
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacher;

    @OneToMany(mappedBy = "group")
    private List<Timetable> timetables;
}
