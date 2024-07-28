package com.gcaio.entities;

public class Filme {
	private String nome;
	private Integer anoLancamento;
	private Double nota;

	public Filme(String nome, Integer anoLancamento, Double nota) {
		this.nome = nome;
		this.anoLancamento = anoLancamento;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Filme [nome=" + nome + ", anoLancamento=" + anoLancamento + ", nota=" + nota + "]";
	}
}
