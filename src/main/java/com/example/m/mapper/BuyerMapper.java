package com.example.m.mapper;

import com.example.m.model.Buyer;

public interface BuyerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Buyer record);

    int insertSelective(Buyer record);

    Buyer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Buyer record);

    int updateByPrimaryKey(Buyer record);

    Buyer selectByName(String name);
}