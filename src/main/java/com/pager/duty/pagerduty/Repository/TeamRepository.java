package com.pager.duty.pagerduty.Repository;

import com.pager.duty.pagerduty.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team,Integer> {

}
