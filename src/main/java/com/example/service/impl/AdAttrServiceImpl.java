package com.example.service.impl;

import com.example.mapper.AdAttrMapper;
import com.example.model.AdAttr;
import com.example.service.AdAttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdAttrServiceImpl implements AdAttrService {

    @Autowired
    private AdAttrMapper mapper;

    @Override
    public boolean add(AdAttr adAttr) {
        int n = mapper.insertSelective(adAttr);
        return n==1;
    }

    @Override
    public AdAttr get(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean up(AdAttr adAttr) {
        int n=mapper.updateByPrimaryKeySelective(adAttr);
        return n==1;
    }

    @Override
    public boolean del(long id) {
        int n=mapper.deleteByPrimaryKey(id);
        return n==1;
    }


    @Override
    public int addAttrs(List<AdAttr> attrs) {
        return mapper.insertAttrs(attrs);
    }

    @Override
    public int delByAd(Long id) {
        int n = mapper.deleteByAd(id);
        return  n;
    }

    @Override
    public int upByAd(List<AdAttr> attrs) {
        int n=0;
        for(AdAttr ad : attrs){
            mapper.updateByAd(ad);
            n++;
        }
        return n;
    }
}
