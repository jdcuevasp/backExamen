package com.fonyou.TestDeveloper.service.impl;

import com.fonyou.TestDeveloper.dto.StudentDto;
import com.fonyou.TestDeveloper.model.Student;
import com.fonyou.TestDeveloper.repository.StudentRepository;
import com.fonyou.TestDeveloper.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void createStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setNameStudent(studentDto.getNameStudent());
        student.setAge(studentDto.getAge());
        student.setTimeZone(studentDto.getTimeZone());
        studentRepository.save(student);
    }
}
