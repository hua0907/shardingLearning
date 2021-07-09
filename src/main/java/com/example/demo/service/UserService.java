package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ProjectName：demo
 * @ClassName：UserService
 * @Date：2021/7/7 18:12
 * @Author：deyihua
 */
@Component
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> list() {
        return userDao.list();
    }

    public void save(User user) {
        userDao.insertSelective(user);
    }
}
