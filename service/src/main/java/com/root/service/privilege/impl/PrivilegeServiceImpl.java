package com.root.service.privilege.impl;

import com.root.bean.Privilege;
import com.root.dao.privilege.IPrivilegeDao;
import com.root.service.privilege.IPrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hs on 2017/5/16.
 */
@Service
public class PrivilegeServiceImpl implements IPrivilegeService {

    @Autowired
    IPrivilegeDao privilegeDao;

    public boolean addPrivilege(Privilege privilege) {
        return privilegeDao.addPrivilege(privilege) > 0;
    }

    public boolean deletePrivilege(String innerId) {
        return privilegeDao.deletePrivilege(innerId) > 0;
    }
}
