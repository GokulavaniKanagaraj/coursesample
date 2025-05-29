package com.course.democourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.course.democourse")
public class DemocourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemocourseApplication.class, args);
	}


}
