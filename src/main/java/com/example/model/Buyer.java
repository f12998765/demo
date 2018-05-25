package com.example.model;

public class Buyer {
    private Long id;

    private String name;

    private String passwd;

    private String mail;

    private String tel;

    private String nickname;

    private String icon;

    public Buyer(String name, String passwd) {
        this.name = name;
        this.passwd = passwd;
    }

    public Buyer(Long id, String name, String passwd) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
    }

    public Buyer(Long id, String name, String passwd, String mail, String tel) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.mail = mail;
        this.tel = tel;
    }

    public Buyer(Long id, String name, String passwd, String nickname) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.nickname = nickname;
    }

    public Buyer(String name, String passwd, String nickname) {
        this.name = name;
        this.passwd = passwd;
        this.nickname = nickname;
    }

    public Buyer(String name, String passwd, String mail, String tel) {
        this.name = name;
        this.passwd = passwd;
        this.mail = mail;
        this.tel = tel;
    }

    public Buyer() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Buyer(Long id, String name, String passwd, String mail, String tel, String nickname, String icon) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.mail = mail;
        this.tel = tel;
        this.nickname = nickname;
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }
}