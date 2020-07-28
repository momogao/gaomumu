package com.atguigu.springcloud.mapper;


import com.atguigu.springcloud.model.StudentInfo;

public interface StudentInfoMapper {
    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);
}