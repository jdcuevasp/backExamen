package com.fonyou.TestDeveloper.controller;

import com.fonyou.TestDeveloper.common.ApiResponse;
import com.fonyou.TestDeveloper.dto.ExamStudentDto;
import com.fonyou.TestDeveloper.dto.StudentDto;
import com.fonyou.TestDeveloper.service.IExamStudentService;
import com.fonyou.TestDeveloper.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/examStudent")
public class ExamStudentController {
    @Autowired
    IExamStudentService examStudentService;

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> createExamStudent(@RequestBody ExamStudentDto examStudentDto){
        examStudentService.createExamStudent(examStudentDto);
        return new ResponseEntity<>(new ApiResponse(true, "Se le añado un examen a un estudiante" + examStudentDto.getStudent() ), HttpStatus.CREATED);
    }


}
