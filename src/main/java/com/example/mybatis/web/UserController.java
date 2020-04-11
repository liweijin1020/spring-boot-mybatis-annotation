package com.example.mybatis.web;

import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author norhtking
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping("/getUsers")
    public List<User> getUsers() {
        return userMapper.getUserAll();
    }

    @GetMapping("/getUser")
    public User getUser(Long id) {
        return userMapper.getUserOne(id);
    }

    @PostMapping("/add")
    public void save(@RequestBody User user) {
        userMapper.insert(user);
    }

    @PutMapping("/update")
    public void update(@RequestBody User user) {
        userMapper.update(user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
    }
}
