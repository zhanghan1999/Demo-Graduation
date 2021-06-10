package com.example.demo.pojo;

public class Commodity {
    private Integer commodity_id;
    private String name;
    private Double price;
    private Integer business_id;
    private String pictureHtml;

    public Commodity() {
    }

    public Commodity(String name, double price, Integer business_id, String pictureHtml) {
        this.name = name;
        this.price = price;
        this.business_id = business_id;
        this.pictureHtml = pictureHtml;
    }

    public Commodity(Integer commodity_id, String name, Double price, Integer business_id, String pictureHtml) {
        this.commodity_id = commodity_id;
        this.name = name;
        this.price = price;
        this.business_id = business_id;
        this.pictureHtml = pictureHtml;
    }

    public Integer getCommodityId() {
        return commodity_id;
    }

    public void setCommodityId(Integer commodity_id) {
        this.commodity_id = commodity_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getBusinessId() {
        return business_id;
    }

    public void setBusinessId(Integer business_id) {
        this.business_id = business_id;
    }

    public String getPictureHtml() {
        return pictureHtml;
    }

    public void setPictureHtml(String pictureHtml) {
        this.pictureHtml = pictureHtml;
    }
}
