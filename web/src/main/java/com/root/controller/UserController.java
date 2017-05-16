package com.root.controller;

import com.common.entity.api.ApiFailResult;
import com.common.entity.api.ApiResult;
import com.common.entity.api.ApiResultUtil;
import com.common.entity.api.ApiSuccessResult;
import com.root.bean.User;
import com.root.service.user.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hs on 2016/12/8.
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class.getName());

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/login")
    public ApiResult login(String userName, String passWord) {
        User user = userService.login(userName, passWord);
        if (user == null) {
            return new ApiFailResult();
        }
        return ApiResultUtil.newSuccessResult(user);
    }

    @RequestMapping(value = "/register")
    public ApiResult register(User user) {
        boolean result = userService.register(user);
        return result ? new ApiSuccessResult() : new ApiFailResult();
    }
}
