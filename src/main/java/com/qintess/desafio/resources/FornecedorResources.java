package com.qintess.desafio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qintess.desafio.entities.Fornecedor;
import com.qintess.desafio.services.FornecedorServices;

@RestController
@RequestMapping(value = "/fornecedores")
public class FornecedorResources {

	@Autowired
	//Injeção de dependencia
	private FornecedorServices service;

	@GetMapping
	// Responde a uma requiseção get
	public ResponseEntity<List<Fornecedor>> findAll() {

		List<Fornecedor> list = service.findAll();//Vai navegar em FornecedorSerices e vai chamar o metodo
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value = "/{id}")
	//A requisição vai aceitar um id como argumentos
	public ResponseEntity<Fornecedor> findById(@PathVariable Integer id){
		
		Fornecedor obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
