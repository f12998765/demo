package com.example.mapper;

import com.example.model.Buyer;

import java.util.List;

public interface BuyerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Buyer record);

    int insertSelective(Buyer record);

    Buyer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Buyer record);

    int updateByPrimaryKey(Buyer record);

    List<Buyer> selectAll();

    Buyer selectByName(String name);
}