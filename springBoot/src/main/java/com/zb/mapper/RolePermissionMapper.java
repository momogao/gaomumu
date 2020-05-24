package com.zb.mapper;

import com.zb.model.RolePermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    List<RolePermission> selectByPrimaryKey(@Param("roleId") Integer id);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}