package com.root.dao.privilege;

import com.root.bean.Privilege;

/**
 * Created by hs on 2017/5/5.
 */
public interface IPrivilegeDao {
    /**
     * 获取权限
     * @param privilegeId 权限ID
     * @return
     */
    Privilege getPrivilege(String privilegeId);

    /**
     * 删除权限
     * @param privilegeId 权限ID
     * @return
     */
    int deletePrivilege(String privilegeId);

    /**
     * 添加权限
     * @param privilege
     * @return
     */
    int addPrivilege(Privilege privilege);
}
