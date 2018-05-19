package com.example.service.impl;

import com.example.mapper.ImgMapper;
import com.example.model.Img;
import com.example.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImgServiceImpl implements ImgService {
    @Autowired
    private ImgMapper mapper;

    @Override
    public boolean add(Img img) {
        int n = mapper.insertSelective(img);
        return n==1;
    }

    @Override
    public Img get(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean up(Img img) {
        int n=mapper.updateByPrimaryKeySelective(img);
        return n==1;
    }

    @Override
    public boolean del(long id) {
        int n=mapper.deleteByPrimaryKey(id);
        return n==1;
    }
}
