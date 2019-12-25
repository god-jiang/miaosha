package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

public interface UserService {
    //通过用户ID获取用户对象的方法
    UserModel getUserById(Integer id);

    //注册
    void register(UserModel userModel) throws BusinessException;

    //登录服务检验
    UserModel validateLogin(String telphone, String password) throws BusinessException;
}
