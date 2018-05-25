package com.example.controller;

import com.example.model.Attr;
import com.example.model.Type;
import com.example.service.AttrService;
import com.example.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/manage")
public class ManageController {

    @Autowired
    private  TypeService typeService;

    @Autowired
    private AttrService attrService;

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
}
