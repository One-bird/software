package cn.fxmpay.software.service;

import cn.fxmpay.software.model.entity.User;

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


}
