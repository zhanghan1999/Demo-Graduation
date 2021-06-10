package com.example.demo.service;


import com.example.demo.pojo.Commodity;
import com.example.demo.pojo.User;


import java.util.List;

//也是没有写对应的注解的，到时候可以改一下

public interface UserService {
    //查询全部
    List<User> getUserList();
    //新增数据
    int addUser(User user);
    //删除数据
    int deleteUser(int userId);
    //根据id查找
    User getUserInfoById(String name);
    //更新数据
    int update(User user);
}