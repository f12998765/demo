package com.example.service.impl;

import com.example.mapper.AttrkeyMapper;
import com.example.model.Attrkey;
import com.example.service.AttrKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttrKeyServiceimpl implements AttrKeyService {

    @Autowired
    public AttrkeyMapper mapper;

    @Override
    public boolean add(Attrkey attrkey) {
        int n = mapper.insertSelective(attrkey);
        return n==1;
    }

    @Override
    public Attrkey get(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean up(Attrkey attrkey) {
        int n=mapper.updateByPrimaryKeySelective(attrkey);
        return n==1;
    }

    @Override
    public boolean del(long id) {
        int n=mapper.deleteByPrimaryKey(id);
        return n==1;
    }

    @Override
    public int addNum(Attrkey t) {
        return mapper.insertSelective(t);
    }
}
