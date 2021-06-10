package com.example.demo.controller;


import com.example.demo.pojo.BaseResult;
import com.example.demo.pojo.OrderCommodity;
import com.example.demo.pojo.OrderSummary;
import com.example.demo.service.impl.OrderCommodityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderCommodityController {

    @Autowired
    private OrderCommodityServiceImpl orderCommodityService;

    @GetMapping("/get_order_summary_order_id")
    public BaseResult<List<OrderCommodity>> getOrderCommodityOrderId(String orderId) {
        return new BaseResult<>(orderCommodityService.getOrderCommodityOrderId(orderId));
    }

    @GetMapping("/add_order_commodity")
    public BaseResult<Integer> addOrderCommodity(String orderId,String name,Integer number,Double price,
                                               Integer commodityId) {
        OrderCommodity orderCommodity = new OrderCommodity(orderId,name,number,price,commodityId);
        return new BaseResult<>(orderCommodityService.addOrderCommodity(orderCommodity));
    }

}
