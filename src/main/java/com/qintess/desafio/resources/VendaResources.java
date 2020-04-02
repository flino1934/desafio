package com.qintess.desafio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qintess.desafio.entities.Venda;
import com.qintess.desafio.services.VendaServices;

@RestController
@RequestMapping(value = "/vendas")
public class VendaResources {

	@Autowired
	//Injeção de dependencia
	private VendaServices service;

	@GetMapping
	// Responde a uma requiseção get
	public ResponseEntity<List<Venda>> findAll() {

		List<Venda> list = service.findAll();//Vai navegar em VendaSerices e vai chamar o metodo
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value = "/{id}")
	//A requisição vai aceitar um id como argumentos
	public ResponseEntity<Venda> findById(@PathVariable Integer id){
		
		Venda obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
