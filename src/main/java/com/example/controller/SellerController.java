package com.example.controller;

import com.example.model.Seller;
import com.example.service.SellerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/seller")
public class SellerController {
    @Autowired
    private SellerService service;

    @RequestMapping(value = "/sign_in",method = RequestMethod.POST)
    public Map<String,Object> sign_in(@RequestParam("name")String name,@RequestParam("passwd") String passwd){
        Map<String,Object> map = new HashMap<>();
        Seller seller = service.getByname(name);
        if(seller==null) {
            map.put("flag", "error");
            map.put("info","用户名不存在");
        }else {
            if (seller.getPasswd().equals(passwd)){
                map.put("flag","ok");
                map.put("info",seller);
            }else {
                map.put("flag","error");
                map.put("info","密码错误");
            }
        }
        return map;
    }

    @RequestMapping(value = "/sign_up",method = RequestMethod.POST)
    public Map<String,String> sign_up(@RequestParam("name") String name,@RequestParam("passwd") String passwd){
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

    @GetMapping(value = "/get")
    public Seller get(@RequestParam("id") Long id){
        return service.get(id);
    }

    @RequestMapping(value = "/up",method = RequestMethod.POST)
    public String up(@RequestBody Seller seller){
        if(service.up(seller))
            return "ok";
        else
            return "error";
    }
}
