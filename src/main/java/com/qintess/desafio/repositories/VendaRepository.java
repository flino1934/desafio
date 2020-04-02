package com.qintess.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.desafio.entities.Venda;

public interface VendaRepository extends JpaRepository<Venda, Integer>{//Vai herdar uma classe pronta que vem com varias operações prontas
	
	

}
