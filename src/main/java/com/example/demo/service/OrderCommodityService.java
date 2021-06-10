package com.example.demo.service;

import com.example.demo.pojo.OrderCommodity;
import com.example.demo.pojo.OrderSummary;

import java.util.List;

public interface OrderCommodityService {

    List<OrderCommodity> getOrderCommodityOrderId(String orderId);

    int addOrderCommodity(OrderCommodity orderCommodity);
}
