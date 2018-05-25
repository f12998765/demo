package com.example.mapper;

import com.example.model.Ad;
import com.example.model.AdAttr;

import java.util.List;

public interface AdAttrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdAttr record);

    int insertSelective(AdAttr record);

    AdAttr selectByPrimaryKey(Long id);

    AdAttr selectByAd(Long id);

    int updateByPrimaryKeySelective(AdAttr record);

    int updateByPrimaryKey(AdAttr record);

    int insertAttrs(List<AdAttr> attrs);

    int updateByAd(AdAttr adAttr);

    int deleteByAd(Long id);
}