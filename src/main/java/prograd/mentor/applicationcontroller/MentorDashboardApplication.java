package prograd.mentor.applicationcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MentorDashboardApplication {

	public static void main(String[] args) {
		System.out.println("Application starts here");
		SpringApplication.run(MentorDashboardApplication.class, args);
	}

}
