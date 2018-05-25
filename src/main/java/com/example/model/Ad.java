package com.example.model;

import java.util.List;

public class Ad {
    private Long id;

    private Long fkSellerId;

    private Long fkTypeId;

    private String name;

    private Long price;

    private List<Img> imgs;

    private Seller seller;

    private Type type;

    private List<AdAttr> attrs;

    private String info;

    public Ad(Long id, Long fkSellerId, Long fkTypeId, String name, Long price,String info) {
        this.id = id;
        this.fkSellerId = fkSellerId;
        this.fkTypeId = fkTypeId;
        this.name = name;
        this.price = price;
        this.info=info;
    }

    public Ad(Long id, Long fkSellerId, Long fkTypeId, String name, Long price) {
        this.id = id;
        this.fkSellerId = fkSellerId;
        this.fkTypeId = fkTypeId;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "id=" + id +
                ", fkSellerId=" + fkSellerId +
                ", fkTypeId=" + fkTypeId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<AdAttr> getAttrs() {
        return attrs;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setAttrs(List<AdAttr> attrs) {
        this.attrs = attrs;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public List<Img> getImgs() {
        return imgs;
    }

    public void setImgs(List<Img> imgs) {
        this.imgs = imgs;
    }

    public Ad() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFkSellerId() {
        return fkSellerId;
    }

    public void setFkSellerId(Long fkSellerId) {
        this.fkSellerId = fkSellerId;
    }

    public Long getFkTypeId() {
        return fkTypeId;
    }

    public void setFkTypeId(Long fkTypeId) {
        this.fkTypeId = fkTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}