package com.example.karthikeyan.model;

public class Users {
    private String name,phone,Password;

    public Users(){

    }

    public Users(String name, String phone, String password) {
        this.name = name;
        this.phone = phone;
        this.Password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}
