package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

//再网上看到 好像是 service和controller和compent 还有这个 都是没有本质区别的
@Repository
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        //就是因为这些调用来调用去的，让我觉得很绕，我姑且认为是，需要提高系统的可调度性
        //所以要做各种分层的操作，减少耦合度，这里的话，相当于就是要用具体操作了，可是其实就是把mapper的方法调用一些
        try {
            List<User> users = userMapper.getUserList();
            return users;
        } catch (Exception e) {
            //好像是 如果不throw的话，会报错。。。
            e.printStackTrace();
            throw e;
        }
    }
//    @Override
//    public List<User> getAllUser() {
//        List<User> findAll = UserMapper.AllUser();
//        return findAll();
//    }

    public int addUser(User user) {
        try {
            return userMapper.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }


    public int deleteUser(int userId) {
        try {
            userMapper.deleteUser(userId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }


    @Override
    public User getUserInfoById(String name) {
        try {
            return userMapper.getUserInfoById(name);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }
}