package com.qintess.desafio.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.qintess.desafio.entities.Fornecedor;
import com.qintess.desafio.entities.FornecedorHasProduto;
import com.qintess.desafio.entities.Produto;
import com.qintess.desafio.repositories.FornecedorHasProdutoRepository;
import com.qintess.desafio.repositories.FornecedorRepository;
import com.qintess.desafio.repositories.ProdutoRepository;

@Configuration
//Esta falando que é uma classe de configuração
@Profile("test")
//Vai rodar essa configuração apenas quando estiver no perfil de teste
public class TestConfig implements CommandLineRunner{

	
	@Autowired
	//Esta fazendo uma injeção de dependencia de forma clara 
	private FornecedorRepository fornecedorRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private FornecedorHasProdutoRepository fornecedorHasProdutorepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Fornecedor f1 = new Fornecedor(null,"Felipe Lino","(13)98137-5682","f.lino1934@hotmail.com");
		Fornecedor f2 = new Fornecedor(null,"Larissa Santana","(13)98137-5932","larissa@hotmail.com");
		fornecedorRepository.saveAll(Arrays.asList(f1,f2));
		
		Produto p1 = new Produto(null,02.0,10,"Parafuso",null);
		Produto p2 = new Produto(null,22.0,12,"Martelo",null);
		produtoRepository.saveAll(Arrays.asList(p1,p2));
		
		FornecedorHasProduto fhp1 = new FornecedorHasProduto(f1,p2,16,p2.getPrecoVenda());
		FornecedorHasProduto fhp2 = new FornecedorHasProduto(f1,p1,12,p1.getPrecoVenda());
		FornecedorHasProduto fhp3 = new FornecedorHasProduto(f2,p2,160,p2.getPrecoVenda());
		
		fornecedorHasProdutorepository.saveAll(Arrays.asList(fhp1,fhp2,fhp2));
		
	}
	
}
