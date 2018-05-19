package com.example.mapper;

import com.example.model.Ad;

import java.util.List;

public interface AdMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Ad record);

    int insertSelective(Ad record);

    Ad selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Ad record);

    int updateByPrimaryKey(Ad record);

    List<Ad> getBySeller(long id);

    List<Ad> getByType(long id);
}