package com.example.exerciciossb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto salvarProduto(@Valid Produto produto) {	
		
		//perciste o produto no mysql e o id retorna de forma correta
		produtoRepository.save(produto);
		return produto;
	
	}
	
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
//	@PutMapping
//	public Produto alterarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}
	
	@DeleteMapping(path="/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
	
}
