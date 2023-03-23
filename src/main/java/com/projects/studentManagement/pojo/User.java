package com.projects.studentManagement.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@ToString
@Getter@Setter
public class User {

    @Id
    private String username;
    private String password;
}
