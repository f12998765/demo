package com.example.service;

import com.example.model.Ad;

import java.util.List;

public interface AdService extends CURDService<Ad>{
    List<Ad> getBySeller(long id);
    List<Ad> getByType(long id);
    List<Ad> getAll();
}
