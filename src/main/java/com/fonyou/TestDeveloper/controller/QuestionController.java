package com.fonyou.TestDeveloper.controller;

import com.fonyou.TestDeveloper.common.ApiResponse;
import com.fonyou.TestDeveloper.dto.ExamStudentDto;
import com.fonyou.TestDeveloper.dto.QuestionDto;
import com.fonyou.TestDeveloper.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/question")
public class QuestionController {

    @Autowired
    IQuestionService questionService;

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> createQuestion(@RequestBody QuestionDto questionDto){
        questionService.createQuestion(questionDto);
        return new ResponseEntity<>(new ApiResponse(true, "Se le añaderon las pregustas" ), HttpStatus.CREATED);
    }
}
