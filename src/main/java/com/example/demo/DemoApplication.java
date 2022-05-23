package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.DAO.PersonneRepository;
import com.example.demo.model.Personne;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

	
	@Autowired
	private PersonneRepository personneRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


		@Override
		public void run(ApplicationArguments args) throws Exception {
		Personne personne1 = new Personne("wick", "john");
		Personne personne2 = new Personne("dalton", "jack");
		Personne personne3 = new Personne("maggio", "carol");
		Personne personne4 = new Personne("cohen", "sophie");
		personneRepository.saveAll(Arrays.asList(personne1, personne2,personne3, personne4));
	}	

}
