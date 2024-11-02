package com.example.exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.exerciciossb.model.entities.Produto;

public interface ProdutoRepository 
	extends PagingAndSortingRepository<Produto, Integer> {
	
	public Iterable<Produto> findByNomeContainingIgnorecase(String parteNome);

}
