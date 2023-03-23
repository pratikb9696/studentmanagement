package com.projects.studentManagement.controller;


import com.projects.studentManagement.pojo.Student;

import com.projects.studentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RequestMapping("/api")
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") int studentId){
        return  studentService.getStudentById(studentId);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudents(){
        return studentService.getAllStudents();
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Void> removeStudentById(@PathVariable("id") int id){
        return studentService.removeStudentById(id);
    }

}
