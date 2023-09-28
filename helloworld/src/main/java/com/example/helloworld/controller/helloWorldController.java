package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class helloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping (value = "/{bsms}")
	public String BSM() {
		return "Persistência\r\n"
				+ "Mentalidade de Crescimento\r\n"
				+ "Orientação ao Futuro\r\n"
				+ "Responsabilidade Pessoal\r\n"
				+ "Trabalho em Equipe\r\n"
				+ "Comunicação\r\n"
				+ "Orientação aos Detalhes\r\n"
				+ "Proatividade";
	}
	@GetMapping (value = "/materias")
	public String materias() {
		return "Aprendizados da semana:\n" + "Dia 23: DDL com SQL.\n" + "Dia 24: Introdução ao SQL.\n"
	+ "Dia 25: SQL avançado.\n" + "Dia 26: Introdução ao desenvolvimento web com o uso de Java e Spring Boot";
	}
	
}






