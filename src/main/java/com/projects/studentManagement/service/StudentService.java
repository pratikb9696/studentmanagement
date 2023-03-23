package com.projects.studentManagement.service;

import com.projects.studentManagement.pojo.Student;
import com.projects.studentManagement.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentServiceRepo{

    @Autowired
    StudentRepo studentRepo;

    @Override
    public ResponseEntity<Student> addStudent(Student student) {
        Student savedStudent=studentRepo.save(student);
        return new ResponseEntity<>(savedStudent,HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Student> getStudentById(int studentId) {
        Student student=studentRepo.findById(studentId).orElse(new Student());
        return new ResponseEntity<>(student,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> studentList=studentRepo.findAll();
        return new ResponseEntity<>(studentList,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> removeStudentById(int id) {
        studentRepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
