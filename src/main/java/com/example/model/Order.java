package com.example.model;

public class Order {
    private Long id;

    private Long fkBuyerId;

    private Long fkAdId;

    private String name;

    private Ad ad;

    private Long status;

    private Buyer buyer;


    public Order(Long fkBuyerId, Long fkAdId, String name, Long status) {
        this.fkBuyerId = fkBuyerId;
        this.fkAdId = fkAdId;
        this.name = name;
        this.status = status;
    }

    public Order(Long id, Long fkBuyerId, Long fkAdId, String name, Long status) {
        this.id = id;
        this.fkBuyerId = fkBuyerId;
        this.fkAdId = fkAdId;
        this.name = name;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", fkBuyerId=" + fkBuyerId +
                ", fkAdId=" + fkAdId +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Ad getAd() {
        return ad;
    }

    public void setAd(Ad ad) {
        this.ad = ad;
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

}