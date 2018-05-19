package com.example.service.impl;

import com.example.mapper.AdMapper;
import com.example.model.Ad;
import com.example.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdServiceImpl implements AdService {
    @Autowired
    private AdMapper mapper;

    @Override
    public boolean add(Ad ad) {
        int n = mapper.insertSelective(ad);
        return n==1;
    }

    @Override
    public Ad get(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean up(Ad ad) {
        int n=mapper.updateByPrimaryKeySelective(ad);
        return n==1;
    }

    @Override
    public boolean del(long id) {
        int n=mapper.deleteByPrimaryKey(id);
        return n==1;
    }
}
