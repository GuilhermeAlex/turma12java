package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller1 {

	@GetMapping ("/get")
	public String hello () {
		return "Aprender ao máximo as novas técnicas e ter mais proatividade ";
	}
}
