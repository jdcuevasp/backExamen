package com.fonyou.TestDeveloper.dto;

import com.fonyou.TestDeveloper.model.ExamStudent;
import com.fonyou.TestDeveloper.model.Question;
import lombok.Data;

import javax.persistence.*;

@Data
public class AnswerDto {

    private Long id;
    private Long examStudent;
    private Long question;
    private String answerOption;
}
