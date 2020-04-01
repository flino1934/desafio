package com.qintess.desafio.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qintess.desafio.entities.Fornecedor;

@RestController
@RequestMapping(value = "/fornecedores")
public class FornecedorResources {

	@GetMapping
	//Responde a uma requiseção get
	public ResponseEntity<Fornecedor>findAll(){
		
		Fornecedor fornecedor = new Fornecedor(1,"Felipe","13981279","f.lino1934@hotmail.com");
		return ResponseEntity.ok().body(fornecedor);
		
	}
	
	
}
