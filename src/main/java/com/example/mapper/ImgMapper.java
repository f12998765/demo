package com.example.mapper;

import com.example.model.Img;

import java.util.List;

public interface ImgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Img record);

    int insertSelective(Img record);

    Img selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Img record);

    int updateByPrimaryKey(Img record);

    int insertImgs(List<Img> imgs);

    Img selectByAdId(Long id);

    int deleteByAd(Long id);
}