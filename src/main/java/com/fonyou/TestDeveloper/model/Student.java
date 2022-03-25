package com.fonyou.TestDeveloper.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name_student")
    private String nameStudent;
    @Column(name="age")
    private Long age;
    @Column(name="time_zone")
    private String timeZone;

}
