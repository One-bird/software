package cn.fxmpay.software.service;

import cn.fxmpay.software.model.entity.User;
import cn.fxmpay.software.utils.JsonData;

import java.util.List;

/**
 * @author OneBird
 * @date 2022/5/19 19:46
 **/
public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAllUser();


    /**
     * 用户登录 = 根据手机号和密码查找
     * @param phone
     * @param pwd
     * @return
     */
    String findByPhoneAndPassword(String phone, String pwd);


    int register(User user);
}
