package com.example.controller;

import com.example.model.Seller;
import com.example.service.SellerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/seller")
public class SellerController {
    @Autowired
    private SellerService service;

    @RequestMapping(value = "/sign_in",method = RequestMethod.POST)
    public Map<String,String> sign_in(@Param("name") String name,@Param("passwd") String passwd){
        Map<String,String> map = new HashMap<>();
        Seller seller = service.getByname(name);
        if(seller==null) {
            map.put("flag", "errer");
            map.put("info","用户名不存在");
        }else {
            if (seller.getPasswd().equals(passwd)){
                map.put("flag","ok");
            }else {
                map.put("flag","errer");
                map.put("inof","密码错误");
            }
        }
        return map;
    }

    @RequestMapping(value = "/sign_up",method = RequestMethod.POST)
    public Map<String,String> sign_up(@Param("name") String name,@Param("passwd") String passwd){
        Map<String,String> map = new HashMap<>();
        Seller seller = service.getByname(name);
        if(seller!=null){
            map.put("flag","error");
            map.put("info","用户名已存在");
        }else {
            seller = new Seller(name,passwd);
            if(service.add(seller)){
                map.put("flag","ok");
            }else {
                map.put("flag","error");
                map.put("info","添加失败");
            }
        }
        return map;
    }
}
