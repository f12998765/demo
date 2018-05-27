package com.example.m.mapper;

import com.example.m.model.Seller;

public interface SellerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Seller record);

    int insertSelective(Seller record);

    Seller selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Seller record);

    int updateByPrimaryKeyWithBLOBs(Seller record);

    int updateByPrimaryKey(Seller record);

    Seller selectByName(String name);
}