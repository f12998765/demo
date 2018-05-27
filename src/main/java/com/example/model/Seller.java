package com.example.model;

public class Seller {
    private Long id;

    private String name;

    private String passwd;

    private String mail;

    private String tel;

    private String nickname;

    private String icon;

    private String info;

    public Seller(Long id, String name, String passwd, String mail, String tel, String nickname, String icon, String info) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.mail = mail;
        this.tel = tel;
        this.nickname = nickname;
        this.icon = icon;
        this.info = info;
    }

    public Seller() {
        super();
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}