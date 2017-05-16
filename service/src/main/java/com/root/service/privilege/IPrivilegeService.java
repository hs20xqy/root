package com.root.service.privilege;

import com.root.bean.Privilege;

/**
 * Created by hs on 2017/5/16.
 */
public interface IPrivilegeService {

    /**
     * 添加权限
     * @param privilege
     * @return
     */
    boolean addPrivilege(Privilege privilege);

    /**
     * 删除权限
     * @param innerId
     * @return
     */
    boolean deletePrivilege(String innerId);
}
