package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAll();

    User selectByUsernamePass(@Param("userName") String username, @Param("passWord") String password);

    User selectByUserName(@Param("userName") String username);
}
