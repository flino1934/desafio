package com.qintess.desafio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qintess.desafio.entities.VendasItens;
import com.qintess.desafio.services.VendaItensServices;

@RestController
@RequestMapping(value = "/vendasitens")
public class VendasItensResources {

	@Autowired
	//Injeção de dependencia
	private VendaItensServices service;

	@GetMapping
	// Responde a uma requiseção get
	public ResponseEntity<List<VendasItens>> findAll() {

		List<VendasItens> list = service.findAll();//Vai navegar em VendasItensSerices e vai chamar o metodo
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value = "/{id}")
	//A requisição vai aceitar um id como argumentos
	public ResponseEntity<VendasItens> findById(@PathVariable Integer id){
		
		VendasItens obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
