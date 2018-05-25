package com.example.service;


import com.example.model.AdAttr;

import java.util.List;

public interface AdAttrService extends CURDService<AdAttr>{
    int addAttrs(List<AdAttr> attrs);
    int delByAd(Long id);
    int upByAd(List<AdAttr> attrs);
}
