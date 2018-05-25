package com.example.service;

import com.example.model.Img;

import java.util.List;

public interface ImgService extends CURDService<Img> {
    int addImgs(List<Img> imgs);
    int delByAd(Long id);
}
