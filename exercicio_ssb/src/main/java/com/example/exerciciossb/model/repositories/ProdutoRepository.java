package com.example.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
	
	

}
