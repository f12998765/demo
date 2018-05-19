package com.example.model;

public class Ad {
    private Long id;

    private Long fkSellerId;

    private Long fkTypeId;

    private String name;

    private Long price;

    public Ad(Long id, Long fkSellerId, Long fkTypeId, String name, Long price) {
        this.id = id;
        this.fkSellerId = fkSellerId;
        this.fkTypeId = fkTypeId;
        this.name = name;
        this.price = price;
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