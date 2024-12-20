package me.holiday.opensearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "me.holiday")
public class OpensearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpensearchApplication.class, args);
	}

}
