package com.root.dao.user.impl;

import com.root.bean.UserAndRole;
import com.root.dao.user.IUserAndRoleDao;
import com.root.mapper.UserAndRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by hs on 2017/5/5.
 */
@Component
public class UserAndRoleDaoImpl implements IUserAndRoleDao {

    @Autowired
    UserAndRoleMapper userAndRoleMapper;

    public int insert(UserAndRole userAndRole) {
        return userAndRoleMapper.insert(userAndRole);
    }

    public int delete(String innerId) {
        return userAndRoleMapper.deleteByPrimaryKey(innerId);
    }
}
