package com.pager.duty.pagerduty.model;

import java.util.List;

//may not be reqd
public class TeamRequest {
    private Team team;
    private List<User> developers;

    public TeamRequest(Team team, List<User> developers) {
        this.team = team;
        this.developers = developers;
    }

    public Team getTeam() {
        return team;
    }

    public List<User> getDevelopers() {
        return developers;
    }
}
