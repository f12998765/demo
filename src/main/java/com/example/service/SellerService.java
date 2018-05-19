package com.example.service;

import com.example.model.Seller;

public interface SellerService extends CURDService<Seller> {
    Seller getByname(String name);
}
