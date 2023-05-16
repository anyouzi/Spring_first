package com.example.spring_first;

import com.example.spring_first.mapper.StudentMapper;
import com.example.spring_first.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringFirstApplicationTests {
    @Autowired
    StudentMapper studentMapper;

    @Test
    void contextLoads() {
    }
    @Test
    void getAllStudent(){
        List<Student>studentList=studentMapper.selectList(null);
        for(Student student:studentList){
            System.out.println(student);
        }
}
}
