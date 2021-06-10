package com.example.demo.service.impl;


import com.example.demo.mapper.OrderCommodityMapper;
import com.example.demo.pojo.OrderCommodity;
import com.example.demo.service.OrderCommodityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderCommodityServiceImpl implements OrderCommodityService {
    @Autowired
    private OrderCommodityMapper orderCommodityMapper;


    @Override
    public List<OrderCommodity> getOrderCommodityOrderId(String orderId) {
        try {
            System.out.println(orderId);
            return orderCommodityMapper.getOrderCommodityOrderId(orderId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int addOrderCommodity(OrderCommodity orderCommodity) {
        try {
            return orderCommodityMapper.addOrderCommodity(orderCommodity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
