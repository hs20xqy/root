package com.root.service.role;

import com.root.bean.Role;
import com.root.bean.RoleAndPrivilege;

/**
 * Created by hs on 2017/5/16.
 */
public interface IRoleService {

    /**
     * 根据ID获取角色
     * @param roleId
     * @return
     */
    Role getRoleById(String roleId);

    /**
     * 根据ID删除角色
     * @param roleId
     * @return
     */
    boolean deleteRoleById(String roleId);

    /**
     * 添加角色
     * @param role
     * @return
     */
    boolean addRole(Role role);

    /**
     * 角色添加权限
     * @param roleAndPrivilege
     * @return
     */
    boolean addPrivilege(RoleAndPrivilege roleAndPrivilege);

    /**
     * 删除角色权限
     * @param innerId
     * @return
     */
    boolean deletePrivilege(String innerId);
}
