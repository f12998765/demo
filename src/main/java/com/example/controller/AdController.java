package com.example.controller;

import com.example.model.Ad;
import com.example.service.AdService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ad")
public class AdController {

    @Autowired
    private AdService adService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addAd(Ad ad){
        if(adService.add(ad))
            return "ok";
        else
            return "error";
    }

    @RequestMapping(value = "/up",method = RequestMethod.POST)
    public String upAd(Ad ad){
        if(adService.up(ad))
            return "ok";
        else
            return "error";
    }

    @RequestMapping("/del")
    public String delAd(long id){
        if(adService.del(id))
            return "ok";
        else
            return "error";
    }

    @RequestMapping("/get")
    public Ad get(@Param("id") long id){
        return adService.get(id);
    }
    @RequestMapping("/seller")
    public List<Ad> getBySeller(@Param("id") long id){
        return adService.getBySeller(id);
    }

    @RequestMapping("/type")
    public List<Ad> getByType(@Param("id") long id){
        return adService.getByType(id);
    }

}
