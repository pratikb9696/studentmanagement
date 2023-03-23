package com.projects.studentManagement.repository;

import com.projects.studentManagement.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
