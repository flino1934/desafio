package com.qintess.desafio.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.qintess.desafio.entities.Fornecedor;
import com.qintess.desafio.repositories.FornecedorRepository;

@Configuration
//Esta falando que é uma classe de configuração
@Profile("test")
//Vai rodar essa configuração apenas quando estiver no perfil de teste
public class TestConfig implements CommandLineRunner{

	
	@Autowired
	//Esta fazendo uma injeção de dependencia de forma clara 
	private FornecedorRepository fornecedorRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Fornecedor f1 = new Fornecedor(null,"Felipe Lino","(13)98137-5682","f.lino1934@hotmail.com");
		Fornecedor f2 = new Fornecedor(null,"Larissa Santana","(13)98137-5932","larissa@hotmail.com");
		fornecedorRepository.saveAll(Arrays.asList(f1,f2));
		
		
	}
	
}
