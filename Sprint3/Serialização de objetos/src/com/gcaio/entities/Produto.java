package com.gcaio.entities;

import java.io.Serial;
import java.io.Serializable;

public class Produto implements Serializable{
	@Serial
	private static final long serialVersionUID = 1L;
	
	private String nome;
	 private int quantidade;
	//private transient int quantidade; quanod nao quer que o atributo seja serializado
	
	
	public Produto(String nome, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public Produto() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", quantidade=" + quantidade + "]";
	}

	
	
	
}
