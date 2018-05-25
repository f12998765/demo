package com.example.controller;

import com.example.model.Ad;
import com.example.model.AdAttr;
import com.example.model.Img;
import com.example.service.AdService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ad")
public class AdController {

    @Autowired
    private AdService adService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addAd(@RequestBody Ad ad){
        if(adService.add(ad))
            return "ok";
        else
            return "error";
    }

    @RequestMapping(value = "/up",method = RequestMethod.POST)
    public String upAd(@RequestBody  Ad ad){
        System.out.println(ad.toString());
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
    public Ad get(@RequestParam("id") long id){
        return adService.get(id);
    }
    @RequestMapping("/seller")
    public List<Ad> getBySeller(@RequestParam("id") long id){
        return adService.getBySeller(id);
    }

    @RequestMapping("/type")
    public List<Ad> getByType(@RequestParam("id") long id){
        return adService.getByType(id);
    }

    @RequestMapping("/all")
    public List<Ad> getAll(){return adService.getAll();}
}
