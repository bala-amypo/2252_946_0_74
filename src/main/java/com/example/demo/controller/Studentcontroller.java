package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.Studentservice;

@RestController
public class Studentcontroller {

    @Autowired
    Studentservice ser;

    @PostMapping("/adddata")
    public Student createData(@RequestBody Student stu) {
        return ser.createData(stu);
    }

    @GetMapping("/fetchrecord")
    public List<Student> fetchRecord() {
        return ser.fetchRecord();
    }
}