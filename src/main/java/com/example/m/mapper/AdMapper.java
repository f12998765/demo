package com.example.m.mapper;

import com.example.m.model.Ad;

public interface AdMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Ad record);

    int insertSelective(Ad record);

    Ad selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Ad record);

    int updateByPrimaryKeyWithBLOBs(Ad record);

    int updateByPrimaryKey(Ad record);
}