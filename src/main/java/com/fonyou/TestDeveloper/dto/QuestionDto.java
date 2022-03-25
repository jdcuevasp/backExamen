package com.fonyou.TestDeveloper.dto;

import com.fonyou.TestDeveloper.model.Exam;
import lombok.Data;

import javax.persistence.*;

@Data
public class QuestionDto {

    private Long id;
    private String description;
    private String optionCorrect;
    private String a;
    private String b;
    private String c;
    private String d;
    private Long score;
    private Long exam;
}
