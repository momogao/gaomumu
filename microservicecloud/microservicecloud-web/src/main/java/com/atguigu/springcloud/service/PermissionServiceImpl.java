package com.atguigu.springcloud.service;

import com.atguigu.springcloud.mapper.PermissionMapper;
import com.atguigu.springcloud.model.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    PermissionMapper permissionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Permission record) {
        return 0;
    }

    @Override
    public int insertSelective(Permission record) {
        return 0;
    }

    @Override
    public Permission selectByPrimaryKey(Integer id) {
        return permissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Permission record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Permission record) {
        return 0;
    }
}
