package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	//mapeando uma requisição para o método abaixo
	//@RequestMapping(method = RequestMethod.GET, path = "/Hello")
	@GetMapping(path = {"/hello", "/world"})
	public String hello() {
		return "Hello, World!";
	}

	/*
	@PostMapping(path = "/world")
	public String world() {
		return "Hello, World! (Post)";
	}
	*/

}
