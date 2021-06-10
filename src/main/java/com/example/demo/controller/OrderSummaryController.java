package com.example.demo.controller;

import com.example.demo.pojo.*;

import com.example.demo.service.impl.CommodityServiceImpl;
import com.example.demo.service.impl.OrderCommodityServiceImpl;
import com.example.demo.service.impl.OrderSummaryServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class OrderSummaryController {

    @Autowired
    private OrderSummaryServiceImpl orderSummaryService;

    @Autowired
    private OrderCommodityServiceImpl orderCommodityService;

    @Autowired
    private CommodityServiceImpl commodityService;

    @GetMapping("/get_order_summary_business")
    public BaseResult<List<OrderSummary>> getOrderSummaryBusiness(Integer businessId) {
        return new BaseResult<>(orderSummaryService.getOrderSummaryBusiness(businessId));
    }

    @GetMapping("/get_order_summary_user")
    public BaseResult<List<OrderSummary>> getOrderSummaryUser(Integer userId) {

        return new BaseResult<>(orderSummaryService.getOrderSummaryUser(userId));
    }

    @GetMapping("/add_order")
    public int addOrder(String orderId, Integer businessId, Integer userId, Double orderMoney,
                        Long time, Long timeNew) {
        OrderSummary orderSummary = new OrderSummary(orderId, userId, businessId, orderMoney, time, timeNew);
        return orderSummaryService.addOrder(orderSummary);
    }

    @PostMapping("/add_order_summary")
    public BaseResult<String> addOrderSummary(@RequestBody OrderBean orderBean) {

        Long time = orderBean.getTakeTime();
        Integer businessId = orderBean.getBusinessId();

        List<Integer> commodityId = orderBean.getGoodsId();
        List<Integer> number = orderBean.getCounts();

        Integer userId = orderBean.getUserId();

        long timeNew = System.currentTimeMillis();
        Double orderMoney = new Double(0);
        String orderId = UUID.randomUUID().toString();
        for (int i = 0; i < commodityId.size(); i++) {
            Commodity commodities = commodityService.getCommodityId(commodityId.get(i));
            String name = commodities.getName();
            Double price = commodities.getPrice();
            orderMoney += price * number.get(i);
            OrderCommodity orderCommodity = new OrderCommodity(orderId, name, number.get(i),
                    price, commodityId.get(i));
            orderCommodityService.addOrderCommodity(orderCommodity);
        }
        OrderSummary orderSummary = new OrderSummary(orderId, userId, businessId, orderMoney, time, timeNew);
        orderSummaryService.addOrder(orderSummary);
        BaseResult<String> result = new BaseResult<>(orderId);
        result.setData(orderId);
        result.setSuccess();
        return result;
    }
}
