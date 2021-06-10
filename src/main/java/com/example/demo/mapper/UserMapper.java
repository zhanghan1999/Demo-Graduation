package com.example.demo.mapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    //查询全部
    @Select("select * from usertable")
    List<User> getUserList();

    //新增数据
    @Insert("insert into usertable(username,userpassword) values(#{username},#{userpassword})")
    int addUser(User user);

    //删除数据
    @Delete("delete from usertable where user_id=#{userId}")
    int deleteUser(int userId);

    //根据id查找  name
    @Select("select * from usertable where username=#{name} ")
    User getUserInfoById(String name);

    //更新数据
    @Update("update usertable set username=#{username},password=#{password} where user_id=#{user_id} ")
    public int update(User user);
}