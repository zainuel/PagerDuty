package com.pager.duty.pagerduty.Repository;

import com.pager.duty.pagerduty.Entiry.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
