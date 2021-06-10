package com.example.demo.pojo;


import java.sql.Timestamp;

public class OrderSummary {
    private String order_id;
    private Integer business_id;
    private Integer user_id;
    private double order_money;
    private Long time;
    private Long time_new;

    public OrderSummary(Integer orderId, String name, Integer number, Double price, Integer commodity_id){}

    public OrderSummary(String order_id,Integer user_id,Integer business_id,double order_money, Long time,Long time_new){
        this.order_id = order_id;
        this.business_id = business_id;
        this.user_id = user_id;
        this.order_money = order_money;
        this.time = time;
        this.time_new = time_new;
    }

    public String getOrderId() {
        return order_id;
    }

    public void setOrderId(String order_id) {
        this.order_id = order_id;
    }

    public Integer getBusinessId() {
        return business_id;
    }

    public void setBusinessId(Integer business_id) {
        this.business_id = business_id;
    }

    public Integer getUserId() {
        return user_id;
    }

    public void setUserId(Integer user_id) {
        this.user_id = user_id;
    }

    public double getOrderMoney() {
        return order_money;
    }

    public void setOrderMoney(double order_money) {
        this.order_money = order_money;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getTimeNew() {
        return time_new;
    }

    public void setTimeNew(Long time_new) {
        this.time_new = time_new;
    }
}
