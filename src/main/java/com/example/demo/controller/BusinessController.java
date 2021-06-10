package com.example.demo.controller;

import com.example.demo.pojo.BaseResult;
import com.example.demo.pojo.Business;
import com.example.demo.service.impl.BusinessServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BusinessController {

    @Autowired
    private BusinessServiceImpl businessService;

    @RequestMapping("/get_business_list")
    public BaseResult<List<Business>> getBusinessList() {
        List<Business> business = businessService.getBusinessList();
        return new BaseResult<>(business);
    }

    @GetMapping("/add_business")
    public Integer addBusiness(String businessname, String businesspassword) {
        Business business = new Business(businessname, businesspassword);
        return businessService.addBusiness(business);
    }

    @GetMapping("/delete_business")
    public void deleteBusiness(Integer businessId) {
        businessService.deleteBusiness(businessId);
    }

    @RequestMapping("/login_business")
    public BaseResult<Business> loginBusiness(String account, String password) {
        Business businessN = businessService.getBusinessInfoById(account);
        if (businessN != null) {
            if (businessN.getBusinesspassword().equals(password)) {
                return new BaseResult<>(businessN);
            } else {
                return new BaseResult<>("账号或密码错误");
            }
        } else {
            return new BaseResult<>("账号或密码错误");
        }
    }

    @GetMapping("/get_business_info_by_id")
    public Business getBusinessInfoById(String businessName) {
        return businessService.getBusinessInfoById(businessName);
    }


}
