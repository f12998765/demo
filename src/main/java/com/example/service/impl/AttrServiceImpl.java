package com.example.service.impl;

import com.example.mapper.AttrMapper;
import com.example.model.Attr;
import com.example.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    private AttrMapper mapper;

    @Override
    public boolean add(Attr attr) {
        int n = mapper.insertSelective(attr);
        return n==1;
    }

    @Override
    public Attr get(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean up(Attr attr) {
        int n=mapper.updateByPrimaryKeySelective(attr);
        return n==1;
    }

    @Override
    public boolean del(long id) {
        int n=mapper.deleteByPrimaryKey(id);
        return n==1;
    }

    @Override
    public List<Attr> getByFK(long id) {
        return mapper.selectByFK(id);
    }
}
