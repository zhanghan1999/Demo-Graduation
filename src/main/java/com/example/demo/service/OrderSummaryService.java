package com.example.demo.service;

import com.example.demo.pojo.OrderSummary;
import com.example.demo.pojo.User;

import java.util.List;

public interface OrderSummaryService {

    List<OrderSummary> getOrderSummaryBusiness(Integer businessId);

    List<OrderSummary> getOrderSummaryUser(Integer userId);

    int addOrder(OrderSummary orderSummary);
}
