package com.rei.annualLeave.configuration;

import com.rei.annualLeave.models.Role;
import com.rei.annualLeave.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasicConfiguration {

    @Bean(name="administrator")
    public User administrator(){
        return new User("Rei", "Balla", "rei23b@gmail.com", "...", Role.ADMINISTRATOR);
    }
}
