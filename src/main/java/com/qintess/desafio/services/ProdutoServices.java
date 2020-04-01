package com.qintess.desafio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qintess.desafio.entities.Produto;
import com.qintess.desafio.repositories.ProdutoRepository;

@Service
public class ProdutoServices {

	@Autowired
	// Injeção de dependencia
	private ProdutoRepository repository;

	public List<Produto> findAll() {// Uma lista que vai retornar todos os fornecedores

		return repository.findAll();// Vai navegar e ir até a classe ProdutoRepository e chamar esse metodo

	}
	
	public Produto findById(Integer id) {

		Optional<Produto> obj = repository.findById(id);
		return obj.get();//Vai retornar um tipo fornecedor que estiver dentro do Optional

	}

}
