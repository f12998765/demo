package com.example.controller;

import com.example.model.Seller;
import com.example.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private SellerService sellerService;

    @RequestMapping("/")
    public String h(){
        return "hello";
    }

    @RequestMapping("/test")
    public Seller get(){
        return sellerService.get(1);
    }
}
