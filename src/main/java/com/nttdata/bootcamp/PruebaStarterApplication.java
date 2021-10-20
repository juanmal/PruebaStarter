package com.nttdata.bootcamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PruebaStarterApplication {

	@Autowired 
	private Saludo s;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaStarterApplication.class, args);
		
		
	}

}
