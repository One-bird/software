package cn.fxmpay.software.controller;

import cn.fxmpay.software.model.entity.User;
import cn.fxmpay.software.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author One_bird
 */
@RestController
@RequestMapping("api/v1/pri/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("test")
    public List<User> findAllUser(){
        List<User> userList = userService.findAllUser();
        return userList;

    }

}
