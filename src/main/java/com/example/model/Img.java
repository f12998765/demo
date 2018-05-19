package com.example.model;

public class Img {
    private Long id;

    private Long tid;

    private String hash;

    private String url;

    private Long fkAdId;

    public Img(Long id, Long tid, String hash, String url, Long fkAdId) {
        this.id = id;
        this.tid = tid;
        this.hash = hash;
        this.url = url;
        this.fkAdId = fkAdId;
    }

    public Img() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash == null ? null : hash.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getFkAdId() {
        return fkAdId;
    }

    public void setFkAdId(Long fkAdId) {
        this.fkAdId = fkAdId;
    }
}