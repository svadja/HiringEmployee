package ua.com.integrity;

import org.camunda.bpm.spring.boot.starter.SpringBootProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HiringEmployeeApplication extends SpringBootProcessApplication{

	public static void main(String[] args) {
		SpringApplication.run(HiringEmployeeApplication.class, args);
	}
}
