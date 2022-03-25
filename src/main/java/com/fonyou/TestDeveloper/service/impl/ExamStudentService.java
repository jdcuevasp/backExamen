package com.fonyou.TestDeveloper.service.impl;

import com.fonyou.TestDeveloper.dto.ExamStudentDto;
import com.fonyou.TestDeveloper.dto.StudentDto;
import com.fonyou.TestDeveloper.model.ExamStudent;
import com.fonyou.TestDeveloper.model.Student;
import com.fonyou.TestDeveloper.repository.ExamRepository;
import com.fonyou.TestDeveloper.repository.ExamStudentRepository;
import com.fonyou.TestDeveloper.repository.StudentRepository;
import com.fonyou.TestDeveloper.service.IExamStudentService;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

@Service
public class ExamStudentService implements IExamStudentService {


    @Autowired
    ExamStudentRepository examStudentRepository;

    @Autowired
    ExamRepository examRepository;
    @Autowired
    StudentRepository studentRepository;


    @Override
    public void createExamStudent(ExamStudentDto examStudentDto) {

        //var exam = examRepository.getById(examStudentDto.);
        //var student = studentRepository.getById(examStudentDto.getStudent().getId());
        ExamStudent examStudent = new ExamStudent();
        examStudent.setExam(examRepository.getById(examStudentDto.getExam()));
        examStudent.setStudent(studentRepository.getById(examStudentDto.getStudent()));
        examStudent.setDateExam(createDateExamForStudent(examStudentDto));
        examStudentRepository.save(examStudent);
    }

    public Date createDateExamForStudent(ExamStudentDto examStudentDto){
        var dateExam = examRepository.getById(examStudentDto.getExam()).getDateExam();
        var timeZone = studentRepository.getById(examStudentDto.getStudent()).getTimeZone();
        DateTimeZone timeZone1 = DateTimeZone.forID(timeZone);
        DateTime dateTime = new DateTime( dateExam, timeZone1 );
        Date outPut = dateTime.toDate();
        return outPut;

    }
}
