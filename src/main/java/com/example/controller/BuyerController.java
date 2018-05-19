package com.example.controller;

import com.example.model.Buyer;
import com.example.service.BuyerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/buyer")
public class BuyerController {

    @Autowired
    private BuyerService service;

    @RequestMapping(value = "/sign_in",method = RequestMethod.POST)
    public Map<String,String> sign_in(@Param("name") String name,@Param("passwd") String passwd){
        Map<String,String> map = new HashMap<>();
        Buyer buyer = service.getByname(name);
        if(buyer==null) {
            map.put("flag", "errer");
            map.put("info","用户名不存在");
        }else {
            if (buyer.getPasswd().equals(passwd)){
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
        Buyer buyer = service.getByname(name);
        if(buyer!=null){
            map.put("flag","error");
            map.put("info","用户名已存在");
        }else {
            buyer = new Buyer(name,passwd);
            if(service.add(buyer)){
                map.put("flag","ok");
            }else {
                map.put("flag","error");
                map.put("info","添加失败");
            }
        }
        return map;
    }
}
