package com.root.dao.user.impl;

import com.root.bean.Role;
import com.root.bean.User;
import com.root.dao.user.IUserDao;
import com.root.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by hs on 2017/5/5.
 */
@Component
public class UserDaoImpl implements IUserDao {

    @Autowired
    UserMapper userMapper;

    public User getUser(String userName, String password) {
        return userMapper.selectByUserNameAndPassword(userName, password);
    }
    public User getUser(String userName) {
        return userMapper.selectByUserName(userName);
    }

    public int addUser(User user) {
        return userMapper.insert(user);
    }

    public int addRole(String userId, String roleId) {
        return 0;
    }

    public int delRole(String userId, String roleId) {
        return 0;
    }

    public List<Role> getRoles(String userId) {
        return null;
    }
}
