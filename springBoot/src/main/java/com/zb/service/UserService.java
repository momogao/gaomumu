package com.zb.service;

import com.github.pagehelper.PageInfo;
import com.zb.model.User;


public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    PageInfo<User> selectAll(int pageNum,int pageSize);

    User selectByUsernamePass(String username, String password);

    User selectByUsername(String username);

    User validateUser(String username, String password);

    void findRoleAndPermissions(User user);
}
