package com.qintess.desafio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qintess.desafio.entities.Produto;
import com.qintess.desafio.services.ProdutoServices;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResources {

	@Autowired
	//Injeção de dependencia
	private ProdutoServices service;

	@GetMapping
	// Responde a uma requiseção get
	public ResponseEntity<List<Produto>> findAll() {

		List<Produto> list = service.findAll();//Vai navegar em ProdutoSerices e vai chamar o metodo
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value = "/{id}")
	//A requisição vai aceitar um id como argumentos
	public ResponseEntity<Produto> findById(@PathVariable Integer id){
		
		Produto obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
