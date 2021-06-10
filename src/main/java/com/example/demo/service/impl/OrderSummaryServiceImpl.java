package com.example.demo.service.impl;

import com.example.demo.mapper.OrderSummaryMapper;
import com.example.demo.pojo.OrderSummary;
import com.example.demo.pojo.User;
import com.example.demo.service.OrderSummaryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class OrderSummaryServiceImpl implements OrderSummaryService {

    @Autowired
    private OrderSummaryMapper orderSummaryMapper;

    @Override
    public List<OrderSummary> getOrderSummaryBusiness(Integer businessId) {
        try {
            System.out.println(businessId);
            return orderSummaryMapper.getOrderSummaryBusiness(businessId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<OrderSummary> getOrderSummaryUser(Integer userId) {
        try {
            return orderSummaryMapper.getOrderSummaryUser(userId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public int addOrder(OrderSummary orderSummary) {
        try {
            return orderSummaryMapper.addOrder(orderSummary);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

}
