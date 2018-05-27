package com.example.service.impl;

import com.example.model.Order;
import com.example.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ManageServiceImpl implements ManageService {

    @Autowired
    private BuyerService buyerService;
    @Autowired
    private SellerService sellerService;
    @Autowired
    private AdService adService;
    @Autowired
    private OrderService orderService;

    @Override
    public Map<String, Object> getinfo() {
        Map<String,Object> map = new HashMap<>();
        int buyerNum = buyerService.getAll().size();
        int sellerNum = sellerService.getAll().size();
        int adNum = adService.getAll().size();
        int orderNum = orderService.getAll().size();

        map.put("bnum",buyerNum);
        map.put("snum",sellerNum);
        map.put("anum",adNum);
        map.put("onum",orderNum);

        return map;
    }
}
