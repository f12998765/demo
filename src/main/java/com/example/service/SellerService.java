package com.example.service;

import com.example.model.Seller;

import java.util.List;

public interface SellerService extends CURDService<Seller> {
    Seller getByname(String name);
    List<Seller> getAll();
    String delSeller(Long id);
}
