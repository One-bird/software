package cn.fxmpay.software.service.impl;

import cn.fxmpay.software.mapper.UserMapper;
import cn.fxmpay.software.model.entity.User;
import cn.fxmpay.software.service.UserService;
import cn.fxmpay.software.utils.CommonUtils;
import cn.fxmpay.software.utils.Jwt;
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
        List<User> userList = userMapper.findAllUser();
        return userList;
    }

    @Override
    public String findByPhoneAndPassword(String phone, String pwd) {
        User user = userMapper.findByPhoneAndPassword(phone, CommonUtils.MD5(pwd));
        System.out.println("22222222");
        if (user == null){
            return null;
        }else {
            String token = Jwt.geneJsonWebToken(user);
            return token;
        }
    }

    @Override
    public int register(User user) {
        int row = userMapper.insert(user);
        return row;
    }
}
