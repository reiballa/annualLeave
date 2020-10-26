package com.rei.annualLeave.configuration;

import com.rei.annualLeave.models.Role;
import com.rei.annualLeave.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class BasicConfiguration {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("password");
        dataSource.setUrl("jdbc:mysql://localhost:3306/annualleave?createDatabaseIfNotExist=true");

        return dataSource;
    }

    @Bean(name="administrator")
    public User administrator(){
        return new User(
                "Rei",
                "Balla",
                "rei23b@gmail.com",
                "...", Role.ADMINISTRATOR);
    }
}
