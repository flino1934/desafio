package com.qintess.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.desafio.entities.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer>{//Vai herdar uma classe pronta que vem com varias operações prontas
	
	

}
