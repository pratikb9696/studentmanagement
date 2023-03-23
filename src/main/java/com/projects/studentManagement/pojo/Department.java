package com.projects.studentManagement.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
@Getter@Setter
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int depId;

    @Column(name = "departmentName")
    private String name;
    @Column(name = "nameOfHod")
    private String hod;
}
