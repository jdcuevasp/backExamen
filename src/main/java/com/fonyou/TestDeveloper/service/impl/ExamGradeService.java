package com.fonyou.TestDeveloper.service.impl;

import com.fonyou.TestDeveloper.dto.ExamGradeDto;

import com.fonyou.TestDeveloper.model.ExamGrade;
import com.fonyou.TestDeveloper.repository.*;
import com.fonyou.TestDeveloper.service.IExamGradeService;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class ExamGradeService implements IExamGradeService {

    @Autowired
    ExamGradeRepository examGradeRepository;

    @Autowired
    ExamStudentRepository examStudentRepository;

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    AnswerRepository answerRepository;

    @Override
    public void createExamGrade(ExamGradeDto examGradeDto) {
        ExamGrade examGrade = new ExamGrade();
        examGrade.setExamStudent(examStudentRepository.getById(examGradeDto.getExamStudent()));
        examGrade.setGrade(totalScore(examGradeDto));

        examGradeRepository.save(examGrade);
    }

    public Long totalScore(ExamGradeDto examGradeDto) {

        var listAnswer = answerRepository.getByExamStudent(examGradeDto.getExamStudent());
        Long score = 0L;

        for (var answer : listAnswer) {
            if (answer.getQuestion().getOptionCorrect().equals(answer.getAnswerOption())) {
                score += answer.getQuestion().getScore();
            }


        }

        return score;
    }
}