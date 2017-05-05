package com.root.mapper;

import com.root.bean.Role;
import com.root.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    User selectByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);

    User selectByUserName(@Param("userName") String userName);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<Role> getRolesByUserId(String userId);
}