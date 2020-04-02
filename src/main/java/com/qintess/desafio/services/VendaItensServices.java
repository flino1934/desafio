package com.qintess.desafio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qintess.desafio.entities.VendasItens;
import com.qintess.desafio.repositories.VendasItensRepository;

@Service
public class VendaItensServices {

	@Autowired
	// Injeção de dependencia
	private VendasItensRepository repository;

	public List<VendasItens> findAll() {// Uma lista que vai retornar todos os fornecedores

		return repository.findAll();// Vai navegar e ir até a classe VendasItensRepository e chamar esse metodo

	}
	
	public VendasItens findById(Integer id) {

		Optional<VendasItens> obj = repository.findById(id);
		return obj.get();//Vai retornar um tipo fornecedor que estiver dentro do Optional

	}

}
