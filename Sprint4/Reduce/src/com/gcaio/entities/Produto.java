package com.gcaio.entities;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto{" + "nome='" + nome + '\'' + ", preco=" + preco + ", quantidade=" + quantidade + '}';
	}

	public static List<Produto> criarExemplos() {
		List<Produto> produtos = new ArrayList<>();

		produtos.add(new Produto("TV", 2000.0, 10));
		produtos.add(new Produto("Computador", 1500.0, 5));
		produtos.add(new Produto("Telefone", 800.0, 20));
		produtos.add(new Produto("Tablet", 600.0, 15));
		produtos.add(new Produto("Impressora", 300.0, 10));

		return produtos;
	}

	
}