package com.example.demo.mapper;


import com.example.demo.pojo.Commodity;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CommodityMapper {

    @Select("select * from commodity")
    List<Commodity> getCommodityList();

    @Insert("insert into commodity(name,price,business_id,picturehtml) values(#{name}," +
            "#{price},#{businessId},#{pictureHtml})")
    int addCommodity(Commodity commodity);

    @Delete("delete from commodity where commodity_id=#{commodityId}")
    int deleteCommodity(Integer commodityId);

    @Update("update commodity set name=#{name},price=#{price} where commodity_id=#{commodityId} ")
    int updateCommodity(String name,Double price, Integer commodityId);

    @Select("select * from commodity where business_id=#{businessId} ")
    List<Commodity> getCommodityBusiness(Integer businessId);

    @Select("select * from commodity where commodity_id=#{commodityId} ")
//    public Commodity get(int business_id);
//    List<Commodity> findCommodityId(Long business_id);
    Commodity getCommodityId(Integer commodityId);

}
