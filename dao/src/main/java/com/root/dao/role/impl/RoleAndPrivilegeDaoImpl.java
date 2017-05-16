package com.root.dao.role.impl;

import com.root.bean.RoleAndPrivilege;
import com.root.dao.role.IRoleAndPrivilegeDao;
import com.root.mapper.RoleAndPrivilegeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by hs on 2017/5/5.
 */
@Component
public class RoleAndPrivilegeDaoImpl implements IRoleAndPrivilegeDao {

    @Autowired
    RoleAndPrivilegeMapper roleAndPrivilegeMapper;

    public int insert(RoleAndPrivilege roleAndPrivilege) {
        return roleAndPrivilegeMapper.insert(roleAndPrivilege);
    }

    public int delete(String innerId) {
        return roleAndPrivilegeMapper.deleteByPrimaryKey(innerId);
    }
}
