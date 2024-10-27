package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.models.Cliente;

@RestController
@RequestMapping("/clientes") //podemos omitir o "path="
public class ClienteController {
	
	@GetMapping(path = "/qualquer")
	public Cliente obterClient() {
		return new Cliente(69, "Juan", "000.000.000-00");
	}

}
