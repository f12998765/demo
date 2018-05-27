package com.example.service;

import com.example.model.Order;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.List;

public interface OrderService extends CURDService<Order> {
    List<Order> getByBuyer(long id);
    List<Order> getByAd(long id);
    List<Order> getBySeller(long id);
    List<Order> getAll();
}
