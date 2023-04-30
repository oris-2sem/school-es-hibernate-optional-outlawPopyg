package com.example.repositories;

import com.example.models.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeTableRepository extends JpaRepository<Timetable, Long> {
}
