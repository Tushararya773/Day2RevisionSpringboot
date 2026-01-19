package com.example.day2_revision.model;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class student_model {
    private int id;
    private String name;
    private String email;
    public student_model(int id ,String name ,String email ){
        this.id=id;
        this.name=name;
        this.email=email;

    }
    public student_model(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
