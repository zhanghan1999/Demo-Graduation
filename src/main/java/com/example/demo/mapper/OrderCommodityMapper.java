package com.example.demo.mapper;

import com.example.demo.pojo.Commodity;
import com.example.demo.pojo.OrderCommodity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderCommodityMapper {


    @Select("select * from order_commodity where order_id=#{orderId} ")
    List<OrderCommodity> getOrderCommodityOrderId(String orderId);

    @Insert("insert into order_commodity(order_id,name,number,price,commodity_id) values(#{orderId}," +
            "#{name},#{number},#{price},#{commodityId})")
    int addOrderCommodity(OrderCommodity orderCommodity);
}
