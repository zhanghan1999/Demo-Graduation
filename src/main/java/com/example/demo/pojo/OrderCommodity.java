package com.example.demo.pojo;

public class OrderCommodity {
    private String order_id;
    private String name;
    private Integer number;
    private Double price;
    private Integer commodity_id;

    public OrderCommodity(){}

    public OrderCommodity(String order_id, String name, Integer number, Double price, Integer commodity_id){
        this.order_id = order_id;
        this.name = name;
        this.number = number;
        this.price = price;
        this.commodity_id = commodity_id;
    }

    public String getOrderId() {
        return order_id;
    }

    public void setOrderId(String order_id) {
        this.order_id = order_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCommodityId() {
        return commodity_id;
    }

    public void setCommodityId(Integer commodity_id) {
        this.commodity_id = commodity_id;
    }
}
