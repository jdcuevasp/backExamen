package com.fonyou.TestDeveloper.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name="questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="description")
    private String description;
    @Column(name="option_correct")
    private String optionCorrect;
    @Column(name="a")
    private String a;
    @Column(name="b")
    private String b;
    @Column(name="c")
    private String c;
    @Column(name="d")
    private String d;
    @Column(name="score")
    private Long score;

    @ManyToOne
    @JoinColumn(name="id_exam")
    private Exam exam;


}
