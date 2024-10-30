package com.example.exerciciossb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.model.entities.Produto;
import com.example.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	//atribui automaticamente um object dentro do atributo produtoRepository
	@Autowired
	private ProdutoRepository produtoRepository;

	@PostMapping
	public @ResponseBody Produto novoProduto(
			@RequestParam String nome,
			@RequestParam double preco,
			@RequestParam double desconto) {
	
		Produto produto = new Produto(nome, preco, desconto);
		
		//perciste o produto no mysql e o id retorna de forma correta
		produtoRepository.save(produto);
		return produto;
	
	}
	
}
