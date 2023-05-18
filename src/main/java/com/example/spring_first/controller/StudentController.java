package com.example.spring_first.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.spring_first.mapper.StudentMapper;
import com.example.spring_first.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
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
//    id查询
    @RequestMapping("/getAllStudentByContinue")
    @ResponseBody
    public List<Student>getAllStudentByContinue(String studentNo){
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("student_no",studentNo);
       // queryWrapper.like("student_name",studentname);
        return studentMapper.selectList(queryWrapper);
    }
//    名字模糊查询
    @RequestMapping("/getAllStudentlike")
    @ResponseBody
    public List<Student>getAllStudentlike(String studentName){
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.like("student_name",studentName);
        return studentMapper.selectList(queryWrapper);
    }
//    添加 String studentNo,String loginPwd,String studentName,String sex,int gradeId,String phone,String address,String bornDate,String email
@RequestMapping("/addStudent")
@ResponseBody
public String addStudent(Student student){
        
    return studentMapper.insert(student)>0?"true":"false";
}
    @RequestMapping("/deleteStudent")
    @ResponseBody
    public String deleteStudent(Student studentNo){
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("student_no",studentNo);
        return studentMapper.delete(queryWrapper)>0?"true":"false";
    }
}
