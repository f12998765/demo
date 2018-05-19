package com.example.mapper;

import com.example.model.Img;

public interface ImgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Img record);

    int insertSelective(Img record);

    Img selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Img record);

    int updateByPrimaryKey(Img record);
}