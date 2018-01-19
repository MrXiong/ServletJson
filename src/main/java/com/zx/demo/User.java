package com.zx.demo;

public class User {
    public String id;           //用户编号
    public String name;         //用户名称
    public int passwords;

    public User() {
    }

    public User(String id, String name, int passwords) {
        this.id = id;
        this.name = name;
        this.passwords = passwords;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPasswords() {
        return passwords;
    }

    public void setPasswords(int passwords) {
        this.passwords = passwords;
    }
}
