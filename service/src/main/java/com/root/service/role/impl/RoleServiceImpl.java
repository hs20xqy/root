package com.root.service.role.impl;

import com.root.bean.Role;
import com.root.bean.RoleAndPrivilege;
import com.root.dao.role.IRoleAndPrivilegeDao;
import com.root.dao.role.IRoleDao;
import com.root.service.role.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hs on 2017/5/16.
 */
@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    IRoleDao roleDao;
    @Autowired
    IRoleAndPrivilegeDao roleAndPrivilegeDao;

    public Role getRoleById(String roleId) {
        return roleDao.getRole(roleId);
    }

    public boolean deleteRoleById(String roleId) {
        return roleDao.deleteRole(roleId) > 0;
    }

    public boolean addRole(Role role) {
        return roleDao.addRole(role) > 0;
    }

    public boolean addPrivilege(RoleAndPrivilege roleAndPrivilege) {
        return roleAndPrivilegeDao.insert(roleAndPrivilege) > 0;
    }

    public boolean deletePrivilege(String innerId) {
        return roleAndPrivilegeDao.delete(innerId) > 0;
    }
}
