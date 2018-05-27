package com.example.service.impl;

import com.example.mapper.SellerMapper;
import com.example.model.Ad;
import com.example.model.Order;
import com.example.model.Seller;
import com.example.service.AdService;
import com.example.service.OrderService;
import com.example.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerServiceImpl implements
        SellerService {

    @Autowired
    private SellerMapper mapper;

    @Autowired
    private AdService adService;

    @Autowired
    private OrderService orderService;

    @Override
    public boolean add(Seller seller) {
        int n = mapper.insertSelective(seller);
        return n==1;
    }

    @Override
    public Seller get(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean up(Seller seller) {
        int n = mapper.updateByPrimaryKeySelective(seller);
        return n==1;
    }

    @Override
    public boolean del(long id) {
        int n = mapper.deleteByPrimaryKey(id);
        return  n==1;
    }

    @Override
    public Seller getByname(String name) {
        Seller seller = mapper.selectByName(name);
        return seller;
    }

    @Override
    public List<Seller> getAll() {
        return  mapper.selectAll();
    }

    @Override
    public String delSeller(Long id) {
        List<Ad> list = adService.getBySeller(id);
        List<Order> orders = orderService.getBySeller(id);
        if(list.size()!=0){
            return "该商家的广告列表不为空，请先删除全部广告";
        }else if(orders.size()!=0){
            return "该商家的订单列表不为空，请先删除全部订单";
        }
        else {
            if(this.del(id)){
                return "ok";
            }else {
                return "删除失败,请稍后尝试";
            }
        }
    }
}
