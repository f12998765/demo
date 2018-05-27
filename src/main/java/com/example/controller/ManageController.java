package com.example.controller;

import com.example.model.Attr;
import com.example.model.Attrkey;
import com.example.model.Type;
import com.example.service.AttrKeyService;
import com.example.service.AttrService;
import com.example.service.ManageService;
import com.example.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/manage")
public class ManageController {

    @Autowired
    private  TypeService typeService;

    @Autowired
    private AttrService attrService;

    @Autowired
    private AttrKeyService attrKeyService;

    @Autowired
    private ManageService manageService;

    @GetMapping("/type/all")
    public List<Type> getAll(){
        List<Type> list = typeService.getAll();
        return list;
    }
    @GetMapping("/type/ad")
    public List<Type> getAllAD(){
        List<Type> list = typeService.getAllAd();
        return list;
    }
    @GetMapping("/attr/get")
    public List<Attr> getAttr(){
        return attrService.getByFK(1);
    }

    @GetMapping("/type/get")
    public Type getType(@RequestParam("id") Long id){
        return typeService.getAttrKey(id);
    }

    @GetMapping("/info")
    public Map<String,Object> getinfo(){
        return manageService.getinfo();
    }

    @RequestMapping(value = "/type/add",method = RequestMethod.POST)
    public int addTyep(@RequestBody Type o){
        System.out.println(o.toString());
        return typeService.addNum(o);
    }

    @RequestMapping(value = "/attr/add",method = RequestMethod.POST)
    public int addAttr(@RequestBody Attr o){
        System.out.println(o);
        return attrService.addNum(o);
    }

    @RequestMapping(value = "/key/add",method = RequestMethod.POST)
    public int addAttrKey(@RequestBody Attrkey o){
        System.out.println(o);
        return attrKeyService.addNum(o);
    }

    @GetMapping("/type/del")
    public String delType(@RequestParam("id") Long id){
        return typeService.del(id) ? "ok":"error";
    }

    @GetMapping("/attr/del")
    public String delAttr(@RequestParam("id") Long id){
        return attrService.del(id) ? "ok":"error";
    }

    @GetMapping("/key/del")
    public String delAttrKey(@RequestParam("id") Long id){
        return attrKeyService.del(id) ? "ok":"error";
    }
}
