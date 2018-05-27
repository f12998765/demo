package com.example.m.model;

public class Attr {
    private Long id;

    private String attr;

    private Long fkTypeId;

    public Attr(Long id, String attr, Long fkTypeId) {
        this.id = id;
        this.attr = attr;
        this.fkTypeId = fkTypeId;
    }

    public Attr() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr == null ? null : attr.trim();
    }

    public Long getFkTypeId() {
        return fkTypeId;
    }

    public void setFkTypeId(Long fkTypeId) {
        this.fkTypeId = fkTypeId;
    }
}