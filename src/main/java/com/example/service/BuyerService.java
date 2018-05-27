package com.example.service;

import com.example.model.Buyer;

import java.util.List;

public interface BuyerService extends CURDService<Buyer>{
    Buyer getByname(String name);
    List<Buyer> getAll();
    String delBuyer(Long id);
}
