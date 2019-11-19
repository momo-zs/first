package com.zs.first.service.serviceImpl;
 
import com.zs.first.bean.UserBean;
import com.zs.first.mapper.UserMapper;
import com.zs.first.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
 
    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}