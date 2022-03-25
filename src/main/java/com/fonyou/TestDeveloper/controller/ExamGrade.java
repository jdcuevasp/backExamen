package com.fonyou.TestDeveloper.controller;

import com.fonyou.TestDeveloper.common.ApiResponse;
import com.fonyou.TestDeveloper.dto.ExamDto;
import com.fonyou.TestDeveloper.dto.ExamGradeDto;
import com.fonyou.TestDeveloper.service.IExamGradeService;
import com.fonyou.TestDeveloper.service.IExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/examGrade")
public class ExamGrade {
    @Autowired
    IExamGradeService examGradeService;

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> createExam(@RequestBody ExamGradeDto examGradeDto){
        examGradeService.createExamGrade(examGradeDto);
        return new ResponseEntity<>(new ApiResponse(true, "El examen ha sido agregado"), HttpStatus.CREATED);
    }
}
