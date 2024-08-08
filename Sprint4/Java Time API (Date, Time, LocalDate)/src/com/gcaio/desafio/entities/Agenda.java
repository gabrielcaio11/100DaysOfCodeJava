package com.gcaio.desafio.entities;

import java.util.ArrayList;
import java.util.List;

import com.gcaio.desafio.exceptions.AgendaCheiaException;
import com.gcaio.desafio.exceptions.ConflitoDeHorarioException;
import com.gcaio.desafio.exceptions.ForaDoHorarioDeAtendemento;

public class Agenda {
	List<Consulta> consultas = new ArrayList<>();

	public void adicionarConsulta(Consulta consulta) {

		if (isPossivelMarcarConsulta(consulta)) {
			consultas.add(consulta);
		}

	}

	private boolean isPossivelMarcarConsulta(Consulta consulta) {
		if (isForaDoHorarioDeAtendemento(consulta)) {
			throw new ForaDoHorarioDeAtendemento("Fora do Horario de atendemento!");
		}
		if (!temHorarioNaAgendaDisponivel()) {
			throw new AgendaCheiaException("Agenda cheia!");
		}
		if (temConflitoDeHorario(consulta)) {
			throw new ConflitoDeHorarioException("Horario indisponivel!");
		}
		return true;

	}

	private boolean temConflitoDeHorario(Consulta consulta) {
		for (Consulta c : consultas) {
			if (consulta.getHorario().equals(c.getHorario())) {
				return true;
			}
		}
		return false;
	}

	private boolean temHorarioNaAgendaDisponivel() {
		if (consultas.size() == 8) {
			return false;
		}
		return true;
	}

	private boolean isForaDoHorarioDeAtendemento(Consulta consulta) {
		if (consulta.getHorario().getHour() < 8 || consulta.getHorario().getHour() > 18) {
			return true;
		}
		return false;
	}

	public void imprimirTodasAsConsultas() {
		for (Consulta c : consultas) {
			System.out.println(c);
		}
	}
}
