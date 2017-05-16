package com.root.dao.user;

import com.root.bean.UserAndRole;

/**
 * Created by hs on 2017/5/5.
 */
public interface IUserAndRoleDao {

    /**
     * 添加角色
     * @param userAndRole
     * @return
     */
    int insert(UserAndRole userAndRole);

    /**
     * 删除角色
     * @param innerId 主键ID
     * @return
     */
    int delete(String innerId);
}
