package com.fonyou.TestDeveloper.service;

import com.fonyou.TestDeveloper.dto.ExamGradeDto;
import com.fonyou.TestDeveloper.model.ExamGrade;

public interface IExamGradeService {
    void createExamGrade(ExamGradeDto examGradeDto);
}
