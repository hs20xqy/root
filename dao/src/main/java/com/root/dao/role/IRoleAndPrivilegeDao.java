package com.root.dao.role;

import com.root.bean.RoleAndPrivilege;
import com.root.bean.UserAndRole;

/**
 * Created by hs on 2017/5/5.
 */
public interface IRoleAndPrivilegeDao {

    /**
     * 添加权限
     * @param roleAndPrivilege
     * @return
     */
    int insert(RoleAndPrivilege roleAndPrivilege);

    /**
     * 删除权限
     * @param innerId 主键ID
     * @return
     */
    int delete(String innerId);
}
