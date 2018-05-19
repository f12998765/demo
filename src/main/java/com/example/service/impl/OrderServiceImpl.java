package com.example.service.impl;

import com.example.mapper.OrderMapper;
import com.example.model.Order;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper mapper;

    @Override
    public boolean add(Order order) {
        int n = mapper.insertSelective(order);
        return n==1;
    }

    @Override
    public Order get(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean up(Order order) {
        int n=mapper.updateByPrimaryKeySelective(order);
        return n==1;
    }

    @Override
    public boolean del(long id) {
        int n=mapper.deleteByPrimaryKey(id);
        return n==1;
    }

    @Override
    public List<Order> getByBuyer(long id) {
        return mapper.getByBuyer(id);
    }

    @Override
    public List<Order> getByAd(long id) {
        return mapper.getByAd(id);
    }
}
