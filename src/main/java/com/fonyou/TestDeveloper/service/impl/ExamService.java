package com.fonyou.TestDeveloper.service.impl;

import com.fonyou.TestDeveloper.dto.ExamDto;
import com.fonyou.TestDeveloper.model.Exam;
import com.fonyou.TestDeveloper.repository.ExamRepository;
import com.fonyou.TestDeveloper.service.IExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamService implements IExamService {
    @Autowired
    ExamRepository examRepository;

    @Override
    public void createExam(ExamDto examDto) {
        Exam exam = new Exam();
        exam.setNameExam(examDto.getNameExam());
        exam.setDateExam(examDto.getDateExam());
        examRepository.save(exam);
    }
}
