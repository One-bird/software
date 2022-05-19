package cn.fxmpay.software.service.impl;

import cn.fxmpay.software.mapper.UserMapper;
import cn.fxmpay.software.model.entity.User;
import cn.fxmpay.software.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author OneBird
 * @date 2022/5/19 19:51
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        System.out.println("=====================");
        List<User> userList = userMapper.findAllUser();

        return userList;
    }
}
