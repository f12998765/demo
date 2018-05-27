package com.example.m.mapper;

import com.example.m.model.Attr;

public interface AttrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Attr record);

    int insertSelective(Attr record);

    Attr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Attr record);

    int updateByPrimaryKey(Attr record);
}