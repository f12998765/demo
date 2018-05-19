package com.example.mapper;

import com.example.model.OrderStatus;

public interface OrderStatusMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderStatus record);

    int insertSelective(OrderStatus record);

    OrderStatus selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderStatus record);

    int updateByPrimaryKey(OrderStatus record);
}