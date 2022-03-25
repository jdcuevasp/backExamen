package com.fonyou.TestDeveloper.controller;

import com.fonyou.TestDeveloper.common.ApiResponse;
import com.fonyou.TestDeveloper.dto.StudentDto;
import com.fonyou.TestDeveloper.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    IStudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> createStudent(@RequestBody StudentDto studentDto){
        studentService.createStudent(studentDto);
        return new ResponseEntity<>(new ApiResponse(true, "El estudiante ha sido agregado"), HttpStatus.CREATED);
    }

}
