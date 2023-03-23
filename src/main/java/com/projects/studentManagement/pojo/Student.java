package com.projects.studentManagement.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@ToString
@Getter@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int stuId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "contactNo")
    private long contactNo;

    @ManyToOne
    private Department dept;

}
