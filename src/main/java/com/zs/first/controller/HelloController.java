package com.zs.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制层
 * @date 2019/11/15 0015 14:06
 * @author zs
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String sayHello(){
        return "hello";
    }
}
