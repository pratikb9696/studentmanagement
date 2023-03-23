package com.projects.studentManagement.controller;

import com.projects.studentManagement.pojo.Department;
import com.projects.studentManagement.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/addDept")
    public ResponseEntity<Department> addDept(@RequestBody Department department){
        return departmentService.addDept(department);
    }

    @GetMapping("/getDept/{id}")
    public ResponseEntity<Department> getDeptById(@PathVariable("id") int id){
        return departmentService.getDept(id);
    }

    @GetMapping("/getAllDept")
    public ResponseEntity<List<Department>> getAllDept(){
        return departmentService.getAllDept();
    }

    @DeleteMapping("/removeDept/{id}")
    public ResponseEntity<Void> removeDeptById(@PathVariable("id") int id){
        return departmentService.removeDept(id);
    }
}
