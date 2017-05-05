package com.root.dao.privilege.impl;

import com.root.bean.Privilege;
import com.root.dao.privilege.IPrivilegeDao;
import com.root.mapper.PrivilegeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by hs on 2017/5/5.
 */
@Component
public class PrivilegeDaoImpl implements IPrivilegeDao {

    @Autowired
    PrivilegeMapper privilegeMapper;

    public Privilege getPrivilege(String privilegeId) {
        return privilegeMapper.selectByPrimaryKey(privilegeId);
    }

    public int deletePrivilege(String privilegeId) {
        return privilegeMapper.deleteByPrimaryKey(privilegeId);
    }

    public int addPrivilege(Privilege privilege) {
        return privilegeMapper.insert(privilege);
    }
}
