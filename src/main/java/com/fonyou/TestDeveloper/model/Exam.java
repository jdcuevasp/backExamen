package com.fonyou.TestDeveloper.model;

import javax.persistence.*;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="exams")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name_exam")
    private String nameExam;

    @Column(name="date_exam")
    private String dateExam;

}
