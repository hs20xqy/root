package com.root.mapper;

import com.root.bean.RoleAndPrivilege;

public interface RoleAndPrivilegeMapper {
    int deleteByPrimaryKey(String innerId);

    int insert(RoleAndPrivilege record);

    int insertSelective(RoleAndPrivilege record);

    RoleAndPrivilege selectByPrimaryKey(String innerId);

    int updateByPrimaryKeySelective(RoleAndPrivilege record);

    int updateByPrimaryKey(RoleAndPrivilege record);
}