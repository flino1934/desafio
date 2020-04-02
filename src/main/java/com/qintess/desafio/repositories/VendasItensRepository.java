package com.qintess.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.desafio.entities.VendasItens;

public interface VendasItensRepository extends JpaRepository<VendasItens, Integer>{//Vai herdar uma classe pronta que vem com varias operações prontas
	
	

}
