package com.generation.lojagames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_produto")

public class Produto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank (message = "O atributo 'nome do produto' é obrigatório!")
	@Size (min = 5, max = 100, message = "O atributo 'nome do produto' deve conter no mínimo 5 e no máximo 100 caracteres")
	private String nomeProduto;
	
	@NotBlank (message = "O atributo 'descrição' é obrigatório!")
	@Size (min = 10, max = 1000, message = "O atributo 'descrição' deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String descricaoProduto;
	
	@NotNull (message = "O atributo 'preço' é obrigatório!")
	@Digits (fraction = 2, integer = 5)
	private float precoProduto;
	
	@NotBlank (message = "O atributo 'fornecedor' é obrigatório!")
	@Size (min = 10, max = 1000, message = "O atributo 'fornecedor' deve conter no mínimo 3 e no máximo 30 caracteres")
	private String fornecedorProduto;
	
	@NotNull (message = "O atributo 'quantidade' é obrigatório!")
	@Min (value = 0, message = "O atributo 'quantidade' deve ser igual ou maior que '0'")
	private int quantidadeProduto;
	
	@ManyToOne
	@JsonIgnoreProperties ("produto")
	private Categoria categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public float getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}

	public String getFornecedorProduto() {
		return fornecedorProduto;
	}

	public void setFornecedorProduto(String fornecedorProduto) {
		this.fornecedorProduto = fornecedorProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
