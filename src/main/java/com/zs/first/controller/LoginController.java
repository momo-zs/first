package com.zs.first.controller;
 
import com.zs.first.bean.UserBean;
import com.zs.first.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 控制层
 * @date 2019/11/15 0015 16:14
 * @author zs
 */

@Slf4j
@Controller
public class LoginController {

    @Autowired
    UserService userService;
 
    @RequestMapping("/login")
    public String show(){
        return "login";
    }
 
    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        UserBean userBean = userService.loginIn(name,password);
        if(userBean!=null){
            log.info("用户:“"+ name +"”登录成功");
            return "success";
        }else {
            log.info("用户:“"+ name +"”登录失败");
            return "error";
        }
    }
 
 
 
}