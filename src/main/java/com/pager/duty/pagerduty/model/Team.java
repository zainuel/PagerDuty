package com.pager.duty.pagerduty.model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String id; // autogenerate ?
    private String name;
    private List<User> users;

    public Team(String name, List<User> users){
        this.name = name;
        this.users = users;
    }

    public Team(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

    public String getName() {
        return name;
    }
}
