package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	@GetMapping("/somar/{a}/{b}")
	public int soma(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}
	
	@GetMapping("/subtrair")
	public int subtrair(
			@PathVariable(name = "a") int a, 
			@PathVariable(name = "b") int b) {
		return a - b;
	}

}
