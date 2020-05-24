package com.zb.service;

import com.zb.mapper.RoleMapper;
import com.zb.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Role record) {
        return 0;
    }

    @Override
    public int insertSelective(Role record) {
        return 0;
    }

    @Override
    public Role selectByPrimaryKey(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Role record) {
        return 0;
    }
}
