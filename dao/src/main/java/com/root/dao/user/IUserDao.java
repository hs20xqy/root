package com.root.dao.user;

import com.root.bean.Role;
import com.root.bean.User;

import java.util.List;

/**
 * Created by hs on 2017/5/5.
 */
public interface IUserDao {
    /**
     * 根据用户名和密码查询用户
     * @param userName
     * @param password
     * @return
     */
    User getUser(String userName, String password);

    /**
     * 根据用户名获取用户
     * @param userName 用户名
     * @return
     */
    User getUser(String userName);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 获取用户角色
     * @param userId 用户ID
     * @return
     */
    List<Role> getRoles(String userId);
}
