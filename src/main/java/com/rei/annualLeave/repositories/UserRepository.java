package com.rei.annualLeave.repositories;

import com.rei.annualLeave.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
