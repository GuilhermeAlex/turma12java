package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping ("/get1")
	public String hello1 () {
		return "Mentalidades:  persistencia e orientação aos detalhes, Habilidades: comunicação e proatividade ";
	}


}
