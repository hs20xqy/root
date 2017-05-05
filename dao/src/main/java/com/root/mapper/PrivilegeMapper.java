package com.root.mapper;

import com.root.bean.Privilege;

public interface PrivilegeMapper {
    int deleteByPrimaryKey(String privilegeId);

    int insert(Privilege record);

    int insertSelective(Privilege record);

    Privilege selectByPrimaryKey(String privilegeId);

    int updateByPrimaryKeySelective(Privilege record);

    int updateByPrimaryKey(Privilege record);
}