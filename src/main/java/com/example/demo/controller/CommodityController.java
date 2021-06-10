package com.example.demo.controller;

import com.example.demo.pojo.BaseResult;
import com.example.demo.pojo.Business;
import com.example.demo.pojo.Commodity;
import com.example.demo.service.impl.CommodityServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommodityController {

    @Autowired
    private CommodityServiceImpl commodityService;

    @RequestMapping("/get_commodityList")
    public List<Commodity> getCommodityList() {
        return commodityService.getCommodityList();
    }

    @GetMapping("/add_commodity")
    public BaseResult<Integer> addCommodity(String name, Double price, Integer businessId, String pictureHtml) {
        Commodity commodity = new Commodity(name, price, businessId, pictureHtml);
        return new BaseResult<>(commodityService.addCommodity(commodity));
    }

    @GetMapping("/delete_commodity")
    public BaseResult<Integer> deleteBusiness(Integer commodityId) {
        int code = commodityService.deleteCommodity(commodityId);
        if (code == -1) {
            return new BaseResult<>("删除失败");
        } else {
            return new BaseResult<>(code);
        }
    }

    @GetMapping("/get_commodity_business")
    public BaseResult<List<Commodity>> getCommodityBusiness(Integer businessId) {
        System.out.println(businessId);
        List<Commodity> commodity = commodityService.getCommodityBusiness(businessId);
        return new BaseResult<>(commodity);
    }

    @GetMapping("/get_commodity_commodity")
    public BaseResult<Commodity> getCommodityId(Integer commodityId) {
        Commodity commodity = commodityService.getCommodityId(commodityId);
        return new BaseResult<>(commodity);
    }

    @GetMapping("/update_commodity")
    public void updateCommodity(Commodity commodity){
        commodityService.updateCommodity(commodity);
    }



}
