package com.example.demo.controller;

import com.example.demo.pojo.BaseResult;
import com.example.demo.pojo.User;
import com.example.demo.service.impl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/login")
    public boolean login(String account, String password) {
        return "admin".equals(account) && "admin123".equals(password);
    }

    @RequestMapping("/login_user")
    public BaseResult<User> loginUser(String account, String password) {
        User userN = userService.getUserInfoById(account);
        if (userN != null) {
            if (userN.getUserpassword().equals(password)) {
                return new BaseResult<>(userN);
            } else {
                return new BaseResult<>("账号或密码错误");
            }
        } else {
            return new BaseResult<>("账号或密码错误");
        }
    }

    @RequestMapping("/register_user")
    public BaseResult<User> registerUser(String account, String password) {
        User user = new User(account, password);
        User userN = userService.getUserInfoById(account);
        if (userN != null) {
            return new BaseResult<>("账号已存在");
        }else{
//            int x = userService.addUser(user);
            return new BaseResult<>(user);
        }

    }


    @RequestMapping("/get_user_list")
    public List<User> getUserlist() {
        return userService.getUserList();
    }

    //新增数据
    @GetMapping("/add_user")
    public int addUser(String username, String userpassword) {
        User user = new User(username, userpassword);
        return userService.addUser(user);
    }

    //删除数据
    @GetMapping("/delete_user")
    public void deleteUser(int userId) {
        userService.deleteUser(userId);
    }

    //根据id查找
    @GetMapping("/getUserInfoById")
    public User getUserInfoById(String name) {
        return userService.getUserInfoById(name);
    }
}