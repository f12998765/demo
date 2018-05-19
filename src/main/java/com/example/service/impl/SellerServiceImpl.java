package com.example.service.impl;

import com.example.mapper.SellerMapper;
import com.example.model.Seller;
import com.example.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerMapper mapper;
    @Override
    public boolean add(Seller seller) {
        int n = mapper.insertSelective(seller);
        return n==1;
    }

    @Override
    public Seller get(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean up(Seller seller) {
        int n = mapper.updateByPrimaryKeySelective(seller);
        return n==1;
    }

    @Override
    public boolean del(long id) {
        int n = mapper.deleteByPrimaryKey(id);
        return  n==1;
    }

    @Override
    public Seller getByname(String name) {
        Seller seller = mapper.selectByName(name);
        return seller;
    }
}
