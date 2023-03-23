package com.projects.studentManagement.repository;

import com.projects.studentManagement.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepo extends JpaRepository<Student, Integer> {
}
