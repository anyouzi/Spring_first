package com.example.spring_first.controller;

import com.example.spring_first.mapper.StudentMapper;
import com.example.spring_first.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentMapper studentMapper;
    @RequestMapping("/getAllStudent")
    @ResponseBody
    public List<Student>getAllStudent(){
        return studentMapper.selectList(null);
    }
}
