package com.example.mapper;

import com.example.model.Order;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> getByBuyer(long id);

    List<Order> getByAd(long id);

    List<Order> getBySeller(long id);
}