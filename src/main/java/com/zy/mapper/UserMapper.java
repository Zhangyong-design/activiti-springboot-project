package com.zy.mapper;

import com.zy.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from tb_user")
    List<User> selectUserList();

    @Select("select * from tb_user where id=#{id}")
    User selectOneUser(Long id);

    @Select("select * from tb_user where username=#{userName}")
    User selectOneUserByName(String userName);
}
