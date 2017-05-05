package com.root.service.impl;

import com.common.util.encrypt.EncryptUtil;
import com.root.bean.User;
import com.root.dao.user.IUserAndRole;
import com.root.dao.user.IUserDao;
import com.root.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * Created by hs on 2017/5/5.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;
    @Autowired
    IUserAndRole userAndRole;


    public User login(String userName, String password) {
        // 对密码进行加密处理
        User user = userDao.getUser(userName);
        if (user == null) {
            return null;
        }
        try {
            String sha_pass = EncryptUtil.getSHA256(password + user.getSalt());
            if (sha_pass.equals(user.getPassword())) {
                return user;
            }else {
                return null;
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean register(User user) {
        String userId = UUID.randomUUID().toString();
        userId = userId.replaceAll("-", "");
        user.setUserId(userId);
        user.setCreateTime(new Date());
        // 生成随机salt
        Random random = new Random();
        int salt = random.nextInt(99999);
        user.setSalt(String.valueOf(salt));
        // 对密码进行加密处理
        String password = user.getPassword();
        password += salt;
        try {
            password = EncryptUtil.getSHA256(password);
            user.setPassword(password);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return  userDao.addUser(user) > 0;
    }


}
