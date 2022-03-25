package com.fonyou.TestDeveloper.dto;

import com.fonyou.TestDeveloper.model.ExamStudent;
import lombok.Data;

import javax.persistence.*;

@Data
public class ExamGradeDto {

    private Long id;
    private Long examStudent;
    private Long grade;
}
