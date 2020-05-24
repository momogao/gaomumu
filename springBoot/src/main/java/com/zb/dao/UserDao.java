package com.zb.dao;

import com.zb.model.User;
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

    User selectByUsernamePass(@Param("username") String username, @Param("password") String password);

    User selectByUsername(@Param("username") String username);
}
