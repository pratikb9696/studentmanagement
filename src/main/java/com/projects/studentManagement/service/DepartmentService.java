package com.projects.studentManagement.service;

import com.projects.studentManagement.pojo.Department;
import com.projects.studentManagement.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements DepartmentServiceRepo{

    @Autowired
    DepartmentRepo departmentRepo;

    @Override
    public ResponseEntity<Department> addDept(Department department) {
        return new ResponseEntity<>(departmentRepo.save(department), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Department> getDept(int id) {
        Department department=departmentRepo.findById(id).orElse(new Department());
        return new ResponseEntity<>(department,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Department>> getAllDept() {
        List<Department> departmentList=departmentRepo.findAll();
        return new ResponseEntity<>(departmentList,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> removeDept(int id) {
        departmentRepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
