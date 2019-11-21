package com.zs.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @date 2019/11/20 0020 14:38
 * @author zs
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(ModelMap map){
        map.addAttribute("name","喵喵");
        map.put("sex", 1);
        List<String> userList = new ArrayList<String>();
        userList.add("张三");
        userList.add("李四");
        userList.add("王五");
        map.addAttribute("userList",userList);
        return "test/testLogin";
    }
}
