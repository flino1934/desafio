package com.qintess.desafio.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.qintess.desafio.entities.pk.FornecedorHasProdutoPK;

@Entity
@Table(name = "tb_fornecedor_has_produto")
public class FornecedorHasProduto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private FornecedorHasProdutoPK id = new FornecedorHasProdutoPK();
	
	private Integer estoque;
	private Double precoCusto;

	public FornecedorHasProduto() {
		// TODO Auto-generated constructor stub
	}

	public FornecedorHasProduto(Fornecedor fornecedor, Produto produto, Integer estoque, Double precoCusto) {

		id.setFornecedor(fornecedor);
		id.setProduto(produto);
		this.estoque = estoque;
		this.precoCusto = precoCusto;
	}

	@JsonIgnore
	//Para cortar o lupping infinito pois o json ficava chamando o fornecedor e o fornecedor chamava o produto e assim repitidamente
	public Fornecedor getFornecedor() {
		return id.getFornecedor();
	}

	public void setFornecedor(Fornecedor fornecedor) {
		id.setFornecedor(fornecedor);
	}
	@JsonIgnore
	public Produto getProduto() {
		return id.getProduto();
	}

	public void setProduto(Produto produto) {
		id.setProduto(produto);
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public Double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(Double precoCusto) {
		this.precoCusto = precoCusto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FornecedorHasProduto other = (FornecedorHasProduto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
