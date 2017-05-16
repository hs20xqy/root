package com.root.service.user;

import com.root.bean.User;
import com.root.bean.UserAndRole;

/**
 * Created by hs on 2017/5/5.
 */
public interface IUserService {
    /**
     * 用户登录方法
     * @param userName 用户名
     * @param password 密码
     * @return
     */
    User login(String userName, String password);


    /**
     * 新用户注册
     * @return
     */
    boolean register(User user);

    /**
     * 给用户添加角色
     * @param userAndRole
     * @return
     */
    boolean addRole(UserAndRole userAndRole);

    /**
     * 删除角色
     * @param innerId
     * @return
     */
    boolean deleteRole(String innerId);
}
