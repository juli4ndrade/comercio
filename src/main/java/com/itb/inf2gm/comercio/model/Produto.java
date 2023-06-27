package com.itb.inf2gm.comercio.model;

public class Produto {
	
	private Long id;
	private String nome;
	private String descricao;
	private String codigoBarra;
	private double preco;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	// public: acesso liberado para todas as classes.
	// private: acesso permitido apenas para os membros da própria classe.
	// entende-se por membros (atributos e ou métodos)
	
	// métodos setter's e getter são responsáveis em atribuir e recuperar informações
	//dos atributos "RESPECTIVAMENTE"

}