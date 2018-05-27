package com.example.m.mapper;

import com.example.m.model.AdAttr;

public interface AdAttrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdAttr record);

    int insertSelective(AdAttr record);

    AdAttr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdAttr record);

    int updateByPrimaryKey(AdAttr record);
}