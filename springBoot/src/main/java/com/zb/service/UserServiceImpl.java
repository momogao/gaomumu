package com.zb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zb.dao.UserDao;
import com.zb.mapper.RolePermissionMapper;
import com.zb.mapper.UserRoleMapper;
import com.zb.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    UserRoleMapper userRoleMapper;

    @Autowired
    RolePermissionMapper rolePermissionMapper;

    @Autowired
    RoleService roleService;

    @Autowired
    PermissionService permissionService;

    @Autowired
    RolePermissionService rolePermissionService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userDao.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userDao.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userDao.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<User> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userDao.selectAll();
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }

    @Override
    public User selectByUsernamePass(String username, String password) {
        return userDao.selectByUsernamePass(username,password);
    }

    @Override
    public User selectByUsername(String username) {
        return userDao.selectByUsername(username);
    }

    @Override
    public User validateUser(String username, String password) {
        User user = new User();
        user.setNickname(username);
        user.setPassword(password);
        return user;
    }

    @Override
    public void findRoleAndPermissions(User user) {
        List<UserRole> useroles = userRoleMapper.selectByPrimaryKey(user.getId());
        List<Role> roles = new ArrayList<>();
        for (UserRole userRole:useroles){
            Role role = roleService.selectByPrimaryKey(Integer.parseInt(userRole.getRoleId()));
            roles.add(role);
        }
        for (Role role:roles){
            List<RolePermission> rolePermissions = rolePermissionService.selectByPrimaryKey(role.getId());
            List<Permission> permissions = new ArrayList<>();
            for (RolePermission rolePermission:rolePermissions){
                Permission permission = permissionService.selectByPrimaryKey(Integer.parseInt(rolePermission.getPermissionId()));
                permissions.add(permission);
            }
            role.setPermissionList(permissions);
        }
        user.setRoleList(roles);
    }
}
