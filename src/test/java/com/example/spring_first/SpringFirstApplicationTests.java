package com.example.spring_first;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("sex","男");
        //queryWrapper.eq("student_no","001");
        List<Student>studentList=studentMapper.selectList(queryWrapper);
        for(Student student:studentList){
            System.out.println(student);
        }
}
}
