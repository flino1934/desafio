package com.qintess.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.desafio.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{//Vai herdar uma classe pronta que vem com varias operações prontas
	
	

}
