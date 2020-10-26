package com.rei.annualLeave.dao;

import com.rei.annualLeave.models.User;
import com.rei.annualLeave.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDAO {

    @Autowired
    UserRepository userRepository;

    public void createUser(User user){
        userRepository.save(user);
    }

}
