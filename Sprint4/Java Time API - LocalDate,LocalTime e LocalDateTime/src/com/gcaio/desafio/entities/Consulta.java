package com.gcaio.desafio.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Consulta {
	private String descricao;
	private LocalDate data;
	private LocalTime horario;

	public Consulta(String descricao, LocalDate data, LocalTime horario) {
		setDescricao(descricao);
		setData(data);
		setHorario(horario);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		Objects.requireNonNull(descricao,"A descricao nao pode ser null");
		this.descricao = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		Objects.requireNonNull(data,"A data nao pode ser null");
		this.data = data;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		Objects.requireNonNull(horario,"A horario nao pode ser null");
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Consulta [descricao=" + descricao + ", data=" + data + ", horario=" + horario + "]";
	}

}
