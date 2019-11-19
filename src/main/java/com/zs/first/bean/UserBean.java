package com.zs.first.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户实体类
 * @date 2019/11/15 0015 14:54
 * @author zs
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBean {

    /**
     * 用户id
     */
    private int id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

}