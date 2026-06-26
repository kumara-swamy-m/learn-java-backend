package com.kumara.__Spring_JDBC;

import com.kumara.__Spring_JDBC.model.Alien;
import com.kumara.__Spring_JDBC.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(Application.class, args);


		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(145);
		alien1.setName("Kumara");
		alien1.setTech("Java");

		AlienRepo alienRepo = context.getBean(AlienRepo.class);
		alienRepo.save(alien1);
		System.out.println(alienRepo.findAll());


	}

}
