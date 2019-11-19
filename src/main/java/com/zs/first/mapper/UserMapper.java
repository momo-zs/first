package com.zs.first.mapper;
 
import com.zs.first.bean.UserBean;

/**
 * dao层
 * @date 2019/11/15 0015 15:18
 * @author zs
 */

public interface UserMapper {

    /**获取用户的姓名和密码
     *
     * @param name
     * @param password
     * @return
     */
    UserBean getInfo(String name,String password);
 
}