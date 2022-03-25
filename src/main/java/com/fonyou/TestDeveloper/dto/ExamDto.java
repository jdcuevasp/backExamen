package com.fonyou.TestDeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamDto {

    private Long id;
    private String nameExam;
    private String dateExam;
}
