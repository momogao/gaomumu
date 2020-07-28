package com.atguigu.springcloud.service;

import com.atguigu.springcloud.mapper.RolePermissionMapper;
import com.atguigu.springcloud.model.RolePermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolePermissionServiceImpl  implements RolePermissionService{
    @Autowired
    RolePermissionMapper rolePermissionMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(RolePermission record) {
        return 0;
    }

    @Override
    public int insertSelective(RolePermission record) {
        return 0;
    }

    @Override
    public List<RolePermission> selectByPrimaryKey(Integer id) {
        return rolePermissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RolePermission record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(RolePermission record) {
        return 0;
    }
}
