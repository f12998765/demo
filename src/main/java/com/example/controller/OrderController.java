package com.example.controller;

import com.example.model.Order;
import com.example.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(Order order){
        return "ok";
//        if(orderService.add(order))
//            return "ok";
//        else
//            return "error";
    }

    @RequestMapping(value = "/up",method = RequestMethod.POST)
    public String up(@RequestBody Order order){
        if(orderService.up(order))
            return "ok";
        else
            return "error";
    }

    @RequestMapping("/del")
    public String del(@RequestParam("id") long id){
        if(orderService.del(id))
            return "ok";
        else
            return "error";
    }

    @RequestMapping("/get")
    public Order get(@RequestParam("id") long id){
        return orderService.get(id);
    }

    @RequestMapping("/buyer")
    public List<Order> getByBuyer(@RequestParam("id") long id){
        return orderService.getByBuyer(id);
    }

    @RequestMapping("/ad")
    public List<Order> getByAd(@RequestParam("id") long id){
        return orderService.getByAd(id);
    }

    @RequestMapping("/seller")
    public List<Order> getBySeller(@RequestParam("id") long id){
        return orderService.getBySeller(id);
    }
}
