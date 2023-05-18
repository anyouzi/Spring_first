package com.example.spring_first.model;

import lombok.Data;

@Data
public class Student {
    private String studentNo;//学号
    private String loginPwd;//密码
    private String studentName;//学生姓名
    private String sex;//性别
    private int gradeId;//年纪id
    private String phone;//手机号
    private String address;//地址
    private String bornDate;
    private String email;
}
