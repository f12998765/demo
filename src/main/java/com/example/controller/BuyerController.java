package com.example.controller;

import com.example.model.Buyer;
import com.example.model.Seller;
import com.example.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/buyer")
public class BuyerController {

    @Autowired
    private BuyerService service;

    @RequestMapping(value = "/sign_in",method = RequestMethod.POST)
    public Map<String,Object> sign_in(@RequestParam("name") String name, @RequestParam("passwd") String passwd){
        Map<String,Object> map = new HashMap<>();
        Buyer buyer = service.getByname(name);
        if(buyer==null) {
            map.put("flag", "error");
            map.put("info","用户名不存在");
        }else {
            if (buyer.getPasswd().equals(passwd)){
                map.put("flag","ok");
                map.put("info",buyer);
            }else {
                map.put("flag","error");
                map.put("info","密码错误");
            }
        }
        return map;
    }

    @RequestMapping(value = "/sign_up",method = RequestMethod.POST)
    public Map<String,String> sign_up(@RequestParam("name") String name,@RequestParam("passwd") String passwd ,@RequestParam("nickname") String nickname){
        Map<String,String> map = new HashMap<>();
        Buyer buyer = service.getByname(name);
        if(buyer!=null){
            map.put("flag","error");
            map.put("info","用户名已存在");
        }else {
            buyer = new Buyer();
            buyer.setName(name);
            buyer.setPasswd(passwd);
            buyer.setNickname(nickname);
            if(service.add(buyer)){
                map.put("flag","ok");
            }else {
                map.put("flag","error");
                map.put("info","添加失败");
            }
        }
        return map;
    }

    @GetMapping(value = "/get")
    public Buyer get(@RequestParam("id") Long id){
        return service.get(id);
    }

    @RequestMapping(value = "/up",method = RequestMethod.POST)
    public String up(@RequestBody Buyer buyer){
        if(service.up(buyer))
            return "ok";
        else
            return "error";
    }

    @GetMapping("/all")
    public List<Buyer> getall(){
        return service.getAll();
    }

    @GetMapping("/del")
    public String del(@RequestParam("id") Long id){
        return service.delBuyer(id);
    }
}
