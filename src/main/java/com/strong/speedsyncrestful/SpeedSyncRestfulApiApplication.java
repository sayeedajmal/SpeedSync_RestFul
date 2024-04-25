package com.strong.speedsyncrestful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SpeedSyncRestfulApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpeedSyncRestfulApiApplication.class, args);
	}

}
