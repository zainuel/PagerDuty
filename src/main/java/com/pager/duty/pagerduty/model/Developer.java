package com.pager.duty.pagerduty.model;

public class Developer extends User{

    private String teamId;

    public String getTeamId() {
        return teamId;
    }

    Developer(String id, String name, String phoneNumber, String teamId) {
        super(id, name, phoneNumber);
        this.teamId = teamId;
    }
}
