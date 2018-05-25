package com.example.service.impl;

import com.example.mapper.TypeMapper;
import com.example.model.Type;
import com.example.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper mapper;

    @Override
    public boolean add(Type type) {
        int n = mapper.insertSelective(type);
        return n==1;
    }

    @Override
    public Type get(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean up(Type type) {
        int n=mapper.updateByPrimaryKeySelective(type);
        return n==1;
    }

    @Override
    public boolean del(long id) {
        int n=mapper.deleteByPrimaryKey(id);
        return n==1;
    }

    @Override
    public List<Type> getAll() {
        List<Type> list = mapper.getAll();
        return list;
    }

    @Override
    public List<Type> getAllAd() {
        return mapper.getAllAd();
    }
}
