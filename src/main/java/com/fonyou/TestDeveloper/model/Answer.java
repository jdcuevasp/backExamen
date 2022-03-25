package com.fonyou.TestDeveloper.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="answers")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_exam_student")
    private  ExamStudent examStudent;
    @ManyToOne
    @JoinColumn(name="id_question")
    private Question question;

    @Column(name = "answer_option")
    private String answerOption;
}
