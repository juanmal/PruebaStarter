package com.nttdata.bootcamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.Saludo;

@RestController
public class Controlador {
	
	@Autowired
	private Saludo saludo;
	
	@GetMapping("/saludo")
	public String getSaludo() {		
		
		return saludo.mensajeSaludo();
	}
}
