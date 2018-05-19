package com.example.service;

import com.example.model.Order;

import java.util.List;

public interface OrderService extends CURDService<Order> {
    List<Order> getByBuyer(long id);
    List<Order> getByAd(long id);
}
