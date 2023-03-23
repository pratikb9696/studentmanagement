package com.projects.studentManagement.repository;


import com.projects.studentManagement.pojo.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepo extends JpaRepository<Department, Integer> {
}
