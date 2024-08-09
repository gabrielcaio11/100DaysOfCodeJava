package com.gcaio.desafio.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Consulta {
	private String nomeDoPaciente;
	private LocalDate data;
	private LocalTime horarioDeInicio;
	private LocalTime horarioDeTermino;

	public Consulta(String nomeDoPaciente, LocalDate data, LocalTime horarioDeInicio) {
		setNomeDoPaciente(nomeDoPaciente);
		setData(data);
		setHorarioDeInicio(horarioDeInicio);
		this.horarioDeTermino = horarioDeInicio.plusHours(1);
		
	}
	

	public String getNomeDoPaciente() {
		return nomeDoPaciente;
	}

	public void setNomeDoPaciente(String descricao) {
		Objects.requireNonNull(descricao,"O nome do paciente nao pode ser null");
		this.nomeDoPaciente = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		Objects.requireNonNull(data,"A data nao pode ser null");
		this.data = data;
	}

	public LocalTime getHorarioDeInicio() {
		return horarioDeInicio;
	}

	public void setHorarioDeInicio(LocalTime horario) {
		Objects.requireNonNull(horario,"A horario nao pode ser null");
		this.horarioDeInicio = horario;
	}
	
	public LocalTime getHorarioDeTermino() {
		return horarioDeTermino;
	}
	@Override
	public String toString() {
		return "Consulta [ Paciente: " + nomeDoPaciente + ", data: " + data + ", horario: " + horarioDeInicio + " ]";
	}

}
