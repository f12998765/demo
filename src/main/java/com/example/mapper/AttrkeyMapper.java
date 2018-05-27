package com.example.mapper;

import com.example.model.Attrkey;

import java.util.List;

public interface AttrkeyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Attrkey record);

    int insertSelective(Attrkey record);

    Attrkey selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Attrkey record);

    int updateByPrimaryKey(Attrkey record);

    List<Attrkey> selectByAttr(Long id);
}