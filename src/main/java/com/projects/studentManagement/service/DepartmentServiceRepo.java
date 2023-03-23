package com.projects.studentManagement.service;

import com.projects.studentManagement.pojo.Department;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DepartmentServiceRepo {
    ResponseEntity<Department> addDept(Department department);

    ResponseEntity<Department> getDept(int id);

    ResponseEntity<List<Department>> getAllDept();

    ResponseEntity<Void> removeDept(int id);
}
