package com.example.m.model;

public class Ad {
    private Long id;

    private Long fkSellerId;

    private Long fkTypeId;

    private String name;

    private Long price;

    private String info;

    public Ad(Long id, Long fkSellerId, Long fkTypeId, String name, Long price, String info) {
        this.id = id;
        this.fkSellerId = fkSellerId;
        this.fkTypeId = fkTypeId;
        this.name = name;
        this.price = price;
        this.info = info;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}