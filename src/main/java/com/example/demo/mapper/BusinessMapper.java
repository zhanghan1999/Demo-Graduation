package com.example.demo.mapper;


import com.example.demo.pojo.Business;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BusinessMapper {

    @Select("select business_id,businessname from business")
    List<Business> getBusinessList();

    @Insert("insert into business(businessname,businesspassword) values(#{businessname},#{businesspassword})")
    int addBusiness(Business business);

    @Delete("delete from business where business_id=#{businessId}")
    Integer deleteBusiness(Integer businessId);

    @Select("select * from business where businessname=#{businessName} ")
    Business getBusinessInfoById(String businessName);
}
