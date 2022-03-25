package com.fonyou.TestDeveloper.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="exams_students")
public class ExamStudent{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_exam")
    private Exam exam;

    @ManyToOne
    @JoinColumn(name="id_student")
    private Student student;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_exam")
    private Date dateExam;

    public ExamStudent(Exam exam, Student student) {
        this.exam = exam;
        this.student = student;
    }
/*
    public ExamStudent(Exam exam, Student student, String dateExam) {
        this.exam = exam;
        this.student = student;
        this.dateExam = dateExam;
    }

 */
}
