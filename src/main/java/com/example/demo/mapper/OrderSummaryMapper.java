package com.example.demo.mapper;

import com.example.demo.pojo.OrderSummary;
import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderSummaryMapper {

    @Select("select * from order_summary where business_id=#{businessId} order by time_new DESC")
    List<OrderSummary> getOrderSummaryBusiness(Integer businessId);

    @Select("select * from order_summary where user_id=#{userId} ")
    List<OrderSummary> getOrderSummaryUser(Integer userId);

    @Insert("insert into order_summary(order_id,business_id,user_id,order_money" +
            ",time,time_new) values(#{orderId},#{businessId},#{userId},#{orderMoney}," +
            "#{time},#{timeNew})")
    int addOrder(OrderSummary orderSummary);
}
