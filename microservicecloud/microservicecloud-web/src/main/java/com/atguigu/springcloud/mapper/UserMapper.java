package com.atguigu.springcloud.mapper;

import com.atguigu.springcloud.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("Select * from user")
    List<User> selectAll();

    @Select("Select * from user where username = #{userName} and password = #{passWord}")
    User selectByUsernamePass(@Param("userName") String username, @Param("passWord") String password);

    @Select("Select * from user where username = #{userName}")
    User selectByUserName(@Param("userName") String username);
}