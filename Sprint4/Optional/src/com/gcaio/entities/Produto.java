package com.gcaio.entities;

import java.util.Objects;

public class Produto {
	private String nome;
	private int quantidade;
	private final String codigo;

	public Produto(String nome, int quantidade, String codigo) {
		Objects.requireNonNull(nome, "O codigo nao pode ser null");
		setNome(nome);
		setQuantidade(quantidade);
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Objects.requireNonNull(nome, "O nome nao pode ser null");
		this.nome = nome;
	}

	public int getQuantidade() {

		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		Objects.requireNonNull(nome, "A quantidade nao pode ser null");
		this.quantidade = quantidade;
	}

	public String getCodigo() {
		return codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
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
		return Objects.equals(codigo, other.codigo);
	}

	// Método toString para exibir informações do produto
	@Override
	public String toString() {
		return "Produto{" + "nome='" + nome + '\'' + ", quantidade=" + quantidade + ", codigo='" + codigo + '\'' + '}';
	}
}
