package com.apps.proyectofinalapps.Entity;

import java.io.Serializable;

public class User {

    private String uid;
    private String name;
    private String email;
    private String birthday;
    private String type;
    private Double[] latLong;
    private long birthdayTimestamp;
    private String password;


    public User(String uid, String name, String email, String birthday, String type, Double[] latLong, long birthdayTimestamp, String password) {
        this.uid = uid;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.type = type;
        this.latLong = latLong;
        this.birthdayTimestamp = birthdayTimestamp;
        this.password = password;
    }

    public User() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double[] getLatLong() {
        return latLong;
    }

    public void setLatLong(Double[] latLong) {
        this.latLong = latLong;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public long getBirthdayTimestamp() {
        return birthdayTimestamp;
    }

    public void setBirthdayTimestamp(long birthdayTimestamp) {
        this.birthdayTimestamp = birthdayTimestamp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
