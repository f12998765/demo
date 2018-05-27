package com.example.model;

public class Attrkey {
    private Long id;

    private Long fkAttrId;

    private String value;

    public Attrkey(Long id, Long fkAttrId, String value) {
        this.id = id;
        this.fkAttrId = fkAttrId;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Attrkey{" +
                "id=" + id +
                ", fkAttrId=" + fkAttrId +
                ", value='" + value + '\'' +
                '}';
    }

    public Attrkey() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFkAttrId() {
        return fkAttrId;
    }

    public void setFkAttrId(Long fkAttrId) {
        this.fkAttrId = fkAttrId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}