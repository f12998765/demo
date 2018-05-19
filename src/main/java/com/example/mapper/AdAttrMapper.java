package com.example.mapper;

import com.example.model.AdAttr;

public interface AdAttrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdAttr record);

    int insertSelective(AdAttr record);

    AdAttr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdAttr record);

    int updateByPrimaryKey(AdAttr record);
}