package com.example.demo.service.impl;

import com.example.demo.mapper.CommodityMapper;
import com.example.demo.pojo.Commodity;
import com.example.demo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public List<Commodity> getCommodityList() {
        try {
            List<Commodity> commoditys = commodityMapper.getCommodityList();
            return commoditys;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int addCommodity(Commodity commodity) {
        try {
            return commodityMapper.addCommodity(commodity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int deleteCommodity(Integer commodityId) {
        try {
            return commodityMapper.deleteCommodity(commodityId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }


//    @Override
//    public Commodity get(int business_id) {
//        return commodityMapper.get(business_id);
//    }

    @Override
    public Commodity getCommodityId(Integer commodityId) {
        try {
            return commodityMapper.getCommodityId(commodityId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Commodity> getCommodityBusiness(Integer businessId) {
        try {
            System.out.println(businessId);
            return commodityMapper.getCommodityBusiness(businessId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
//    @Override
//    public int updateCommodity(Commodity commodity) {
//        return commodityMapper.updateCommodity(commodity);
//    }

    @Override
    public void updateCommodity(Commodity commodity) {
//        commodityMapper.updateCommodity();
    }

}
