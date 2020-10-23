package com.rei.annualLeave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AnnualLeaveApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnualLeaveApplication.class, args);
	}

}
