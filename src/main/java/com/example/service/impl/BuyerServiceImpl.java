package com.example.service.impl;

import com.example.mapper.BuyerMapper;
import com.example.model.Buyer;
import com.example.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private BuyerMapper mapper;

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
}
