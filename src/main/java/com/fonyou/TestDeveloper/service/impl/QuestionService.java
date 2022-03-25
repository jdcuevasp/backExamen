package com.fonyou.TestDeveloper.service.impl;

import com.fonyou.TestDeveloper.dto.QuestionDto;
import com.fonyou.TestDeveloper.model.Question;
import com.fonyou.TestDeveloper.model.Student;
import com.fonyou.TestDeveloper.repository.ExamRepository;
import com.fonyou.TestDeveloper.repository.QuestionRepository;
import com.fonyou.TestDeveloper.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService implements IQuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    ExamRepository examRepository;

    @Override
    public void createQuestion(QuestionDto questionDto) {
        Question question = new Question();
        question.setDescription(questionDto.getDescription());
        question.setOptionCorrect(questionDto.getOptionCorrect());
        question.setA(questionDto.getA());
        question.setB(questionDto.getB());
        question.setC(questionDto.getC());
        question.setD(questionDto.getD());
        question.setOptionCorrect(questionDto.getOptionCorrect());
        question.setExam(examRepository.getById(questionDto.getExam()));
        questionRepository.save(question);
    }
}
