package com.example.m.model;

public class AdAttr {
    private Long id;

    private String value;

    private Long fkAdId;

    private Long fkAttrId;

    public AdAttr(Long id, String value, Long fkAdId, Long fkAttrId) {
        this.id = id;
        this.value = value;
        this.fkAdId = fkAdId;
        this.fkAttrId = fkAttrId;
    }

    public AdAttr() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Long getFkAdId() {
        return fkAdId;
    }

    public void setFkAdId(Long fkAdId) {
        this.fkAdId = fkAdId;
    }

    public Long getFkAttrId() {
        return fkAttrId;
    }

    public void setFkAttrId(Long fkAttrId) {
        this.fkAttrId = fkAttrId;
    }
}