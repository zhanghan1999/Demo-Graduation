package com.example.demo.service;

import com.example.demo.pojo.Commodity;
import com.example.demo.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommodityService {

    List<Commodity> getCommodityList();

    int addCommodity(Commodity commodity);

    int deleteCommodity(Integer commodityId);

//    Commodity get(int business_id);
    List<Commodity> getCommodityBusiness(Integer business_id);


    Commodity getCommodityId(Integer commodity_id);

    void updateCommodity(Commodity commodity);

}
