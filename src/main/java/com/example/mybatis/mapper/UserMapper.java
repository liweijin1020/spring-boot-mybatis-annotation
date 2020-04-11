package com.example.mybatis.mapper;

import com.example.mybatis.enums.UserSexEnum;
import com.example.mybatis.model.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author norhtking
 */
public interface UserMapper {

    /**
     * 查所有
     * @return
     */
    @Select("SELECT * FROM users")
    @Results({
            @Result(property = "userSex",column = "user_sex",javaType = UserSexEnum.class),
            @Result(property = "nickName",column = "nick_name")
    })
    List<User> getUserAll();

    /**
     * 查一个
     * @param id
     * @return
     */
    @Select("SELECT * FROM users WHERE id=#{id}")
    @Results({
            @Result(property = "userSex",column = "user_sex",javaType = UserSexEnum.class),
            @Result(property = "nickName",column = "nick_name")
    })
    User getUserOne(Long id);

    /**
     * 插入
     * @param user
     */
    @Select("INSERT INTO users(username,password,user_sex) VALUES(#{userName},#{passWord},#{userSex})")
    void insert(User user);

    /**
     * 修改
     * @param user
     */
    @Select("UPDATE users SET username=#{userName},password=#{passWord},user_sex=#{userSex} WHERE id=#{id}")
    void update(User user);

    /**
     * 删除
     * @param id
     */
    @Select("DELETE FROM users WHERE id=#{id}")
    void delete(Long id);
}
