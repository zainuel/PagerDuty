package com.pager.duty.pagerduty.Controller;

import com.pager.duty.pagerduty.model.TeamRequest;
import com.pager.duty.pagerduty.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team")
public class TeamController {

   @Autowired
   private TeamService teamService;

   @PostMapping("/create/newTeam")
   public ResponseEntity<Object> createTeam(@RequestBody TeamRequest teamRequest){
      teamService.createTeam(teamRequest);


   }

   /*
   * Models
   * -------
   * User --> Developer,
   * Team -> id, Name, List<Users>

   * Observer Pattern -> Alerts -> Subject , Teams -> Observers ?
   * Notification -> Stratergy Pattern (Phone, Sms...)
   *Factory Pattern ->
   *
   * */
}
