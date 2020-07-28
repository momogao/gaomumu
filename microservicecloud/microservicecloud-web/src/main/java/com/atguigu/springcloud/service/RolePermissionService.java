package com.atguigu.springcloud.service;

import com.atguigu.springcloud.model.RolePermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolePermissionService {
    int deleteByPrimaryKey(Integer id);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    List<RolePermission> selectByPrimaryKey(@Param("roleId") Integer id);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}
