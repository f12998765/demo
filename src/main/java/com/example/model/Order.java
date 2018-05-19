package com.example.model;

public class Order {
    private Long id;

    private Long fkBuyerId;

    private Long fkAdId;

    private String name;

    private Long fkStatusId;

    public Order(Long id, Long fkBuyerId, Long fkAdId, String name, Long fkStatusId) {
        this.id = id;
        this.fkBuyerId = fkBuyerId;
        this.fkAdId = fkAdId;
        this.name = name;
        this.fkStatusId = fkStatusId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getFkStatusId() {
        return fkStatusId;
    }

    public void setFkStatusId(Long fkStatusId) {
        this.fkStatusId = fkStatusId;
    }
}