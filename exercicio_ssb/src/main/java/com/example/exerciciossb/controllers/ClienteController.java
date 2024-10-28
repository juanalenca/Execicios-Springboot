package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.model.Cliente;

@RestController
@RequestMapping("/clientes") //podemos omitir o "path="
public class ClienteController {
	
	@GetMapping(path = "/qualquer")
	public Cliente obterClient() {
		return new Cliente(69, "Juan", "000.000.000-00");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) { //@PathVariable: coloca o valor na url
		return new Cliente(id, "Marta", "123.456.789-10");
	}
	
	@GetMapping
	public Cliente obterClientePorId2(
			@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "Amaro", "167.556.989-69");
	}

}
