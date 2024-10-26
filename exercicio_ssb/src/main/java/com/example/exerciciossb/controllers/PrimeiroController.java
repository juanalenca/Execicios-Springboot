package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	//mapeando uma requisição para o método abaixo
	//@RequestMapping(method = RequestMethod.GET, path = "/Hello")
	@GetMapping(path = {"/Hello", "/world"})
	public String Hello() {
		return "Hello, World!";
				
	}

}
