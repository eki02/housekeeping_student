package com.example.housekeeping_student.repository;

import com.example.housekeeping_student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByNameContainingIgnoreCaseOrRoomNoContainingIgnoreCase(String name, String roomNo);
}
