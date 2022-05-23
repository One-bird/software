package cn.fxmpay.software.mapper;
import org.apache.ibatis.annotations.Param;

import cn.fxmpay.software.model.entity.User;import java.util.List;

/**
 * @author OneBird
 * @date 2022/5/19 21:43
 **/
public interface UserMapper {


    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> findAllUser();
    User findById(@Param("id")Integer id);

    /**
     *用户登录 = 根据手机号和密码查找
     * @param phone
     * @param password
     * @return
     */
    User findByPhoneAndPassword(@Param("phone")String phone,@Param("password")String password);




    int insertList(@Param("list")List<User> list);


}