package com.projects.studentManagement.service;

import com.projects.studentManagement.pojo.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentServiceRepo {


    ResponseEntity<Student> addStudent(Student student);

    ResponseEntity<Student> getStudentById(int studentId);

    ResponseEntity<List<Student>> getAllStudents();

    ResponseEntity<Void> removeStudentById(int id);
}
