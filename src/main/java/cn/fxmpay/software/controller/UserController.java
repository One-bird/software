package cn.fxmpay.software.controller;

import cn.fxmpay.software.model.entity.User;
import cn.fxmpay.software.model.request.LoginRequest;
import cn.fxmpay.software.service.UserService;
import cn.fxmpay.software.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("login")
    public JsonData login(@RequestBody LoginRequest loginRequest){
        String token = userService.findByPhoneAndPassword(loginRequest.getPhone(),loginRequest.getPwd());

        return token==null ? JsonData.buildError("账号或密码错误") : JsonData.buildSuccess(token);
    }

    /**
     * 注册
     * @param user
     * @return
     */
    @PostMapping("register")
    public JsonData register(@RequestBody User user){
        int row = userService.register(user);
        if (row == 1){
            return JsonData.buildSuccess("注册成功");
        }else {
            return JsonData.buildError("注册失败");
        }
    }


}
