package com.qintess.desafio.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	// Identifica como chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Auto incrementavel no banco
	private Integer id;
	private Double precoVenda;
	private Integer minEstoque;
	private String nome;
	private String foto;

	@OneToMany(mappedBy = "id.produto")
	private Set<FornecedorHasProduto> fornecedorHasProduto = new HashSet<>();

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(Integer id, Double precoVenda, Integer minEstoque, String nome, String foto) {

		this.id = id;
		this.precoVenda = precoVenda;
		this.minEstoque = minEstoque;
		this.nome = nome;
		this.foto = foto;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public Integer getMinEstoque() {
		return minEstoque;
	}

	public void setMinEstoque(Integer minEstoque) {
		this.minEstoque = minEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Set<FornecedorHasProduto> getFornecedorHasProduto() {
		return fornecedorHasProduto;
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
