package com.fonyou.TestDeveloper.controller;

import com.fonyou.TestDeveloper.common.ApiResponse;
import com.fonyou.TestDeveloper.dto.AnswerDto;
import com.fonyou.TestDeveloper.dto.ExamStudentDto;
import com.fonyou.TestDeveloper.service.IAnswerService;
import com.fonyou.TestDeveloper.service.IExamStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/answer")
public class AnswerController {
    @Autowired
    IAnswerService answerService;

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> createAnswer(@RequestBody AnswerDto answerDto){
        answerService.createAnswer(answerDto);

        return new ResponseEntity<>(new ApiResponse(true, "Se le ingresado  las respuestas del estudiante! " ), HttpStatus.CREATED);
    }
}
