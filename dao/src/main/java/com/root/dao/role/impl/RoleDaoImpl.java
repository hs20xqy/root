package com.root.dao.role.impl;

import com.root.bean.Role;
import com.root.bean.User;
import com.root.dao.role.IRoleDao;
import com.root.mapper.RoleMapper;
import com.root.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by hs on 2017/5/5.
 */
@Component
public class RoleDaoImpl implements IRoleDao {

    @Autowired
    RoleMapper roleMapper;

    public Role getRole(String roleId) {
        return roleMapper.selectByPrimaryKey(roleId);
    }

    public int deleteRole(String roleId) {
        return roleMapper.deleteByPrimaryKey(roleId);
    }

    public int addRole(Role role) {
        return roleMapper.insert(role);
    }
}
