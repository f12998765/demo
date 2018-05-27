package com.example.model;

import java.util.List;

public class Attr {
    private Long id;

    private String attr;

    private Long fkTypeId;

    private List<Attrkey> attrkeys;

    public Attr(Long id, String attr, Long fkTypeId) {
        this.id = id;
        this.attr = attr;
        this.fkTypeId = fkTypeId;
    }

    public Attr() {
        super();
    }

    public List<Attrkey> getAttrkeys() {
        return attrkeys;
    }

    @Override
    public String toString() {
        return "Attr{" +
                "id=" + id +
                ", attr='" + attr + '\'' +
                ", fkTypeId=" + fkTypeId +
                ", attrkeys=" + attrkeys +
                '}';
    }

    public void setAttrkeys(List<Attrkey> attrkeys) {
        this.attrkeys = attrkeys;
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