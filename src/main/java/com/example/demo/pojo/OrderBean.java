package com.example.demo.pojo;

import java.util.List;

public class OrderBean {

    public OrderBean() {

    }
    
    public OrderBean(long takeTime, int userId, int businessId, List<Integer> goodsId, List<Integer> counts) {
        this.takeTime = takeTime;
        this.userId = userId;
        this.businessId = businessId;
        this.goodsId = goodsId;
        this.counts = counts;
    }
    
    private long takeTime;

    private Integer userId;

    private Integer businessId;

    private List<Integer> goodsId;
    
    private List<Integer> counts;

    public long getTakeTime() {
        return takeTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public List<Integer> getGoodsId() {
        return goodsId;
    }

    public List<Integer> getCounts() {
        return counts;
    }
}
