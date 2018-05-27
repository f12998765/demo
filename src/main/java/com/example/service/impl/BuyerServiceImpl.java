package com.example.service.impl;

import com.example.mapper.BuyerMapper;
import com.example.model.Buyer;
import com.example.model.Order;
import com.example.service.BuyerService;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private BuyerMapper mapper;

    @Autowired
    private OrderService orderService;

    @Override
    public boolean add(Buyer buyer) {
        int n = mapper.insertSelective(buyer);
        return n==1;
    }

    @Override
    public Buyer get(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean up(Buyer buyer) {
        int n=mapper.updateByPrimaryKeySelective(buyer);
        return n==1;
    }

    @Override
    public boolean del(long id) {
        int n=mapper.deleteByPrimaryKey(id);
        return n==1;
    }

    @Override
    public Buyer getByname(String name) {
        return mapper.selectByName(name);
    }

    @Override
    public List<Buyer> getAll() {
        return  mapper.selectAll();
    }

    @Override
    public String delBuyer(Long id) {
        List<Order> orders = orderService.getByBuyer(id);
        if(orders.size()!=0){
            return "该商家的订单列表不为空，请先删除全部订单";
        }
        else {
            if(this.del(id)){
                return "ok";
            }else {
                return "删除失败,请稍后尝试";
            }
        }
    }
}
