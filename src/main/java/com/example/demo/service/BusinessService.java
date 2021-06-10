package com.example.demo.service;

import com.example.demo.pojo.Business;
import com.example.demo.pojo.User;

import java.util.List;

public interface BusinessService {

    List<Business> getBusinessList();

    int addBusiness(Business business);

    Integer deleteBusiness(Integer businessId);

    Business getBusinessInfoById(String businessName);
}
