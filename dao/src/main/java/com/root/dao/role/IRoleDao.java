package com.root.dao.role;

import com.root.bean.Role;
import com.root.bean.User;

/**
 * Created by hs on 2017/5/5.
 */
public interface IRoleDao {
    /**
     * 获取角色
     * @param roleId 角色ID
     * @return
     */
    Role getRole(String roleId);

    /**
     * 删除角色
     * @param roleId 角色ID
     * @return
     */
    int deleteRole(String roleId);

    /**
     * 添加角色
     * @param role
     * @return
     */
    int addRole(Role role);
}
