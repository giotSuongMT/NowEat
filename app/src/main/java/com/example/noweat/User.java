package com.example.noweat;

public class User {
    private String phone;
    private String name;
    private String password;

    //Construct
    public User() {
    }
    public User(String phone, String name, String password) {
        this.phone = phone;
        this.name = name;
        this.password = password;
    }

    // Getter and setter
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
