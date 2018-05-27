package com.example.m.model;

public class Type {
    private Long id;

    private String type;

    public Type(Long id, String type) {
        this.id = id;
        this.type = type;
    }

    public Type() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}