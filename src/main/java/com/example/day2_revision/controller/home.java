package com.example.day2_revision.controller;

import com.example.day2_revision.model.student_model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
    @GetMapping("/")
    public student_model getstudent(){
        student_model student= new student_model(1,"Tushar","tushararya773@gmail.com");
        return student;
    }
}
