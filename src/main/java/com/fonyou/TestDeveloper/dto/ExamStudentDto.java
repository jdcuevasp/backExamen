package com.fonyou.TestDeveloper.dto;

import com.fonyou.TestDeveloper.model.Exam;
import com.fonyou.TestDeveloper.model.Student;
import lombok.Data;
import org.joda.time.DateTime;

import java.util.Date;


@Data
public class ExamStudentDto {

    private Long id;
    private Long exam;
    private Long student;
    private Date dateExam;
}
