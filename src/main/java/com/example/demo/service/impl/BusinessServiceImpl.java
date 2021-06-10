package com.example.demo.service.impl;


import com.example.demo.pojo.Business;
import com.example.demo.service.BusinessService;
import com.example.demo.mapper.BusinessMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BusinessServiceImpl implements BusinessService{

    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public List<Business> getBusinessList() {
        //就是因为这些调用来调用去的，让我觉得很绕，我姑且认为是，需要提高系统的可调度性
        //所以要做各种分层的操作，减少耦合度，这里的话，相当于就是要用具体操作了，可是其实就是把mapper的方法调用一些
        try {
            List<Business> businesss = businessMapper.getBusinessList();
            return businesss;
        } catch (Exception e) {
            //好像是 如果不throw的话，会报错。。。
            e.printStackTrace();
            throw e;
        }
    }

    public int addBusiness(Business business) {
        try {
            return businessMapper.addBusiness(business);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public Integer deleteBusiness(Integer businessId) {
        try {
            businessMapper.deleteBusiness(businessId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public Business getBusinessInfoById(String businessName) {
        try {
            return businessMapper.getBusinessInfoById(businessName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
