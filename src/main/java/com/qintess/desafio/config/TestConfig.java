package com.qintess.desafio.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.qintess.desafio.entities.Fornecedor;
import com.qintess.desafio.entities.FornecedorHasProduto;
import com.qintess.desafio.entities.Produto;
import com.qintess.desafio.entities.Venda;
import com.qintess.desafio.repositories.FornecedorHasProdutoRepository;
import com.qintess.desafio.repositories.FornecedorRepository;
import com.qintess.desafio.repositories.ProdutoRepository;
import com.qintess.desafio.repositories.VendaRepository;

@Configuration
//Esta falando que é uma classe de configuração
@Profile("test")
//Vai rodar essa configuração apenas quando estiver no perfil de teste
public class TestConfig implements CommandLineRunner{

	
	@Autowired
	//Esta fazendo uma injeção de dependencia de forma clara 
	private FornecedorRepository fornecedorRepository;
	
	@Autowired
	//Esta fazendo uma injeção de dependencia de forma clara 
	private ProdutoRepository produtoRepository;
	
	@Autowired
	//Esta fazendo uma injeção de dependencia de forma clara 
	private FornecedorHasProdutoRepository fornecedorHasProdutorepository;
	
	@Autowired
	//Esta fazendo uma injeção de dependencia de forma clara 
	private VendaRepository vendaRepository;

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
		
		fornecedorHasProdutorepository.saveAll(Arrays.asList(fhp1,fhp2,fhp3));
		
		Venda v1 = new Venda(null,1,3,"Dinheiro",Instant.parse("2020-01-20T19:53:07Z"));
		Venda v2 = new Venda(null,2,7,"CC",Instant.parse("2020-02-20T19:53:07Z"));
		Venda v3 = new Venda(null,3,5,"CD",Instant.parse("2020-03-20T19:53:07Z"));
		
		vendaRepository.saveAll(Arrays.asList(v1,v2,v3));
		
	}
	
}
