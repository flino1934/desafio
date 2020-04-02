package com.qintess.desafio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qintess.desafio.entities.Venda;
import com.qintess.desafio.repositories.VendaRepository;

@Service
public class VendaServices {

	@Autowired
	// Injeção de dependencia
	private VendaRepository repository;

	public List<Venda> findAll() {// Uma lista que vai retornar todos os fornecedores

		return repository.findAll();// Vai navegar e ir até a classe VendaRepository e chamar esse metodo

	}
	
	public Venda findById(Integer id) {

		Optional<Venda> obj = repository.findById(id);
		return obj.get();//Vai retornar um tipo fornecedor que estiver dentro do Optional

	}

}
