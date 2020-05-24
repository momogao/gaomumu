package com.zb.mapper;

import com.zb.model.StudentInfo;

public interface StudentInfoMapper {
    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);
}