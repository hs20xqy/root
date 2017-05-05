package com.root.mapper;

import com.root.bean.UserAndRole;

public interface UserAndRoleMapper {
    int deleteByPrimaryKey(String innerId);

    int insert(UserAndRole record);

    int insertSelective(UserAndRole record);

    UserAndRole selectByPrimaryKey(String innerId);

    int updateByPrimaryKeySelective(UserAndRole record);

    int updateByPrimaryKey(UserAndRole record);
}