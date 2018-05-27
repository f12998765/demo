package com.example.m.model;

public class Order {
    private Long id;

    private String name;

    private Long fkBuyerId;

    private Long fkAdId;

    private Long status;

    public Order(Long id, String name, Long fkBuyerId, Long fkAdId, Long status) {
        this.id = id;
        this.name = name;
        this.fkBuyerId = fkBuyerId;
        this.fkAdId = fkAdId;
        this.status = status;
    }

    public Order() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getFkBuyerId() {
        return fkBuyerId;
    }

    public void setFkBuyerId(Long fkBuyerId) {
        this.fkBuyerId = fkBuyerId;
    }

    public Long getFkAdId() {
        return fkAdId;
    }

    public void setFkAdId(Long fkAdId) {
        this.fkAdId = fkAdId;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}