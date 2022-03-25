package com.fonyou.TestDeveloper.service.impl;

import com.fonyou.TestDeveloper.dto.AnswerDto;

import com.fonyou.TestDeveloper.model.Answer;

import com.fonyou.TestDeveloper.model.ExamGrade;
import com.fonyou.TestDeveloper.repository.AnswerRepository;
import com.fonyou.TestDeveloper.repository.ExamGradeRepository;
import com.fonyou.TestDeveloper.repository.ExamStudentRepository;
import com.fonyou.TestDeveloper.repository.QuestionRepository;
import com.fonyou.TestDeveloper.service.IAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService implements IAnswerService {

    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    ExamGradeRepository examGradeRepository;

    @Autowired
    ExamStudentRepository examStudentRepository;

    @Autowired
    QuestionRepository questionRepository;



    @Override
    public void createAnswer(AnswerDto answerDto) {
            Answer answer = new Answer();

            answer.setAnswerOption(answerDto.getAnswerOption());
            answer.setExamStudent(examStudentRepository.getById(answerDto.getExamStudent()));
            answer.setQuestion(questionRepository.getById(answerDto.getQuestion()));



            answerRepository.save(answer);

        }




    }







