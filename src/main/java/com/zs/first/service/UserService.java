package com.zs.first.service;
 
import com.zs.first.bean.UserBean;

/**
 * 业务层
 * @date 2019/11/15 0015 15:23
 * @author zs
 */

public interface UserService {

    /**
     * 用户登录
     * @param name
     * @param password
     * @return
     */
    UserBean loginIn(String name,String password);
 
}