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




}