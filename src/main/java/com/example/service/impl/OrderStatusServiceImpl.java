package com.example.service.impl;

import com.example.mapper.OrderStatusMapper;
import com.example.model.OrderStatus;
import com.example.service.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderStatusServiceImpl implements OrderStatusService {

    @Autowired
    private OrderStatusMapper mapper;

    @Override
    public boolean add(OrderStatus orderStatus) {
        int n = mapper.insertSelective(orderStatus);
        return n==1;
    }

    @Override
    public OrderStatus get(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean up(OrderStatus orderStatus) {
        int n=mapper.updateByPrimaryKeySelective(orderStatus);
        return n==1;
    }

    @Override
    public boolean del(long id) {
        int n=mapper.deleteByPrimaryKey(id);
        return n==1;
    }
}
