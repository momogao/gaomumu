package com.spring.day01.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class StudentVo extends BaseVo {
    private String name;
    private String age;
    private String sex;
}
