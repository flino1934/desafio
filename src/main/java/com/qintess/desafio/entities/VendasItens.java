package com.qintess.desafio.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_venda_itens")
public class VendasItens implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer quantidade;
	private String precoCuto;
	private Double precounit;

	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;
	@ManyToOne
	@JoinColumn(name = "venda_id")
	private Venda venda;

	public VendasItens() {
		// TODO Auto-generated constructor stub
	}

	public VendasItens(Integer id, Integer quantidade, String precoCuto, Double precounit, Produto produto,Venda venda) {

		this.id = id;
		this.quantidade = quantidade;
		this.precoCuto = precoCuto;
		this.precounit = precounit;
		this.produto = produto;
		this.venda = venda;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getPrecoCuto() {
		return precoCuto;
	}

	public void setPrecoCuto(String precoCuto) {
		this.precoCuto = precoCuto;
	}

	public Double getPrecounit() {
		return precounit;
	}

	public void setPrecounit(Double precounit) {
		this.precounit = precounit;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
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
		VendasItens other = (VendasItens) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
