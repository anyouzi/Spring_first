package com.example.spring_first.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.spring_first.model.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
