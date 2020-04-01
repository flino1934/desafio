package com.qintess.desafio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qintess.desafio.entities.Fornecedor;
import com.qintess.desafio.repositories.FornecedorRepository;

@Service
public class FornecedorServices {

	@Autowired
	// Injeção de dependencia
	private FornecedorRepository repository;

	public List<Fornecedor> findAll() {// Uma lista que vai retornar todos os fornecedores

		return repository.findAll();// Vai navegar e ir até a classe FornecedorRepository e chamar esse metodo

	}
	
	public Fornecedor findById(Integer id) {

		Optional<Fornecedor> obj = repository.findById(id);
		return obj.get();//Vai retornar um tipo fornecedor que estiver dentro do Optional

	}

}
