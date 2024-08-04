package com.gcaio.entities;

public class Produto {
	private String nome;
	private int quantidade;
	private String codigo;

	public Produto(String nome, int quantidade, String codigo) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public String getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Produto{" + "nome='" + nome + '\'' + ", quantidade=" + quantidade + ", codigo='" + codigo + '\'' + '}';
	}

}
