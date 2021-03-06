package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello () {
		return "Hello World!";
	}
	@GetMapping ("/bsm")
	public String bsm () {
		return "Comunicação <br /> Persistência <br /> Mentalidade de crescimento <br /> Resposabilidade pessoal <br /> Orientação ao futuro ";
	}
	@GetMapping ("/objetivos")
	public String objetivos () {
		return "Aprender a fazer o controller, revisar o spring e revisar o sql";
	}
}
