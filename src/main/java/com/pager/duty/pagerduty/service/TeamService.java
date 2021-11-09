package com.pager.duty.pagerduty.service;

import com.pager.duty.pagerduty.Entiry.Team;
import com.pager.duty.pagerduty.Repository.UserRepository;
import com.pager.duty.pagerduty.model.TeamRequest;
import com.pager.duty.pagerduty.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private UserRepository userRepository;


//throw exception if coudn't create team
    // use try catch
    public void createTeam(TeamRequest teamRequest){
      //  Team te
    }

    public void createUser(User user){
        userRepository.save()
    }


}
