package com.example.demo.pojo;

public class User {
    //有四个属性
    private String username;
    private String userpassword;
    private int user_id;


    public User() {
    }

    public User(int user_id) {
        this.user_id = user_id;
    }

    public User(String username, String userpassword) {
        this.username = username;
        this.userpassword = userpassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int userId) {
        this.user_id = user_id;
    }
}