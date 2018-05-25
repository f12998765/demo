package com.example.service.impl;

import com.example.mapper.AdMapper;
import com.example.mapper.ImgMapper;
import com.example.model.Ad;
import com.example.model.AdAttr;
import com.example.model.Attr;
import com.example.model.Img;
import com.example.service.AdAttrService;
import com.example.service.AdService;
import com.example.service.AttrService;
import com.example.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class AdServiceImpl implements AdService {
    @Autowired
    private AdMapper mapper;
    @Autowired
    private ImgService imgService;
    @Autowired
    private AdAttrService adAttrService;

    @Override
    public boolean add(Ad ad) {
        try {
            int n=mapper.insertSelective(ad);
            if(ad.getImgs().size()!=0){
                try {
                    for(Img img : ad.getImgs()){
                        img.setFkAdId(ad.getId());
                    }
                    int m=imgService.addImgs(ad.getImgs());
                    if(m!=ad.getImgs().size()){
                        mapper.deleteByPrimaryKey(ad.getId());
                        System.out.println("图片插入错误");
                        return false;
                    }
                }catch (Exception e){
                    mapper.deleteByPrimaryKey(ad.getId());
                    return false;
                }
            }
            if(ad.getAttrs().size()!=0){
                for(AdAttr at : ad.getAttrs()){
                    at.setFkAdId(ad.getId());
                }
                int a=adAttrService.addAttrs(ad.getAttrs());
                if(a!=ad.getAttrs().size()){
                    mapper.deleteByPrimaryKey(ad.getId());
                    System.out.println("属性添加错误");
                    return false;
                }
            }
        }catch (Exception e){
            System.out.println("广告插入错误");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Ad get(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean up(Ad ad) {
        int n=mapper.updateByPrimaryKeySelective(ad);

        imgService.delByAd(ad.getId());
        List<Img> imgs = ad.getImgs();
        for(Img i  : imgs){
            i.setFkAdId(ad.getId());
        }
//        System.out.println();
        if(imgs.size()>0){
            imgService.addImgs(ad.getImgs());
        }

        List<AdAttr> attrs = ad.getAttrs();
        adAttrService.delByAd(ad.getId());
        if(attrs.size()>0){
            adAttrService.addAttrs(attrs);
        }

        return n==1;
    }

    @Override
    public boolean del(long id) {
        int n=mapper.deleteByPrimaryKey(id);
        return n==1;
    }

    @Override
    public List<Ad> getBySeller(long id) {
        return mapper.getBySeller(id);
    }

    @Override
    public List<Ad> getByType(long id) {
        return mapper.getByType(id);
    }

    @Override
    public List<Ad> getAll() {
        return mapper.getAll();
    }
}
