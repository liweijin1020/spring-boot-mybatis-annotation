package com.example.mybatis.mapper;

import com.example.mybatis.enums.UserSexEnum;
import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void saveUserTest() {
//        userMapper.insert(new User("xiaogang","123456", UserSexEnum.MAN));
//        userMapper.insert(new User("xiaoming","123456", UserSexEnum.WOMAN));
//        userMapper.insert(new User("xiaohang","123456", UserSexEnum.MAN));

        Assert.assertEquals(6,userMapper.getUserAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<User> users = userMapper.getUserAll();
        System.out.println(users.toString());
    }


    @Test
    public void testUpdate() throws Exception {

    }
}
