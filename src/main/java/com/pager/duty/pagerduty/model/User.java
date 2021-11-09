package com.pager.duty.pagerduty.model;

//Developer: id, team_id, name, phone number

public abstract class User {

    private String id; // this can be autogenrated
    private String name;
    private String phoneNumber;

    User(String id, String name, String phoneNumber){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    User( String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
