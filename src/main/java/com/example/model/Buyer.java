package com.example.model;

public class Buyer {
    private Long id;

    private String name;

    private String passwd;

    private String nickname;

    private String icon;

    private String mail;

    private String tel;

    public Buyer(Long id, String name, String passwd, String nickname, String icon, String mail, String tel) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.nickname = nickname;
        this.icon = icon;
        this.mail = mail;
        this.tel = tel;
    }

    public Buyer() {
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
}