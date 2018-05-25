package com.example.model;

public class AdAttr {
    private Long id;

    private String value;

    private Long fkAdId;

    private Long fkAttrId;

    private Attr attr;

    public AdAttr(Long id, String value, Long fkAdId, Long fkAttrId) {
        this.id = id;
        this.value = value;
        this.fkAdId = fkAdId;
        this.fkAttrId = fkAttrId;
    }

    public Attr getAttr() {
        return attr;
    }

    public void setAttr(Attr attr) {
        this.attr = attr;
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