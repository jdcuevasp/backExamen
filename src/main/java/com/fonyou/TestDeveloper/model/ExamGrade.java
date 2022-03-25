package com.fonyou.TestDeveloper.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="exam_grades")
public class ExamGrade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @OneToOne
    @JoinColumn(name = "id_exam_student")
    private ExamStudent examStudent;

    @Column(name = "grade")
    private Long grade;

}
