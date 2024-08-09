package com.gcaio.desafio.entities;

import java.util.ArrayList;
import java.util.List;

import com.gcaio.desafio.exceptions.AgendaCheiaException;
import com.gcaio.desafio.exceptions.ConflitoDeHorarioException;
import com.gcaio.desafio.exceptions.ForaDoHorarioDeAtendemento;

public class Agenda {
	List<Consulta> consultas = new ArrayList<>();

	public void adicionarConsulta(Consulta consulta)
			throws ForaDoHorarioDeAtendemento, AgendaCheiaException, ConflitoDeHorarioException {

		if (isPossivelMarcarConsulta(consulta)) {
			consultas.add(consulta);
		}

	}

	private boolean isPossivelMarcarConsulta(Consulta consulta)
			throws ForaDoHorarioDeAtendemento, AgendaCheiaException, ConflitoDeHorarioException {
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
			if (consulta.getHorarioDeInicio().equals(c.getHorarioDeInicio())) {
				return true;
			}
			if (consulta.getHorarioDeInicio().isAfter(c.getHorarioDeInicio())
					&& consulta.getHorarioDeInicio().isBefore(c.getHorarioDeInicio())) {
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
		if (consulta.getHorarioDeInicio().getHour() < 8 || consulta.getHorarioDeInicio().getHour() > 18) {
			return true;
		}
		return false;
	}

	public void imprimirTodasAsConsultas() {
		if (consultas.isEmpty()) {
			System.out.println("\nNenhuma consulta marcada para hoje!");
		} else {
			for (Consulta c : consultas) {
				System.out.println(c);
			}
		}
	}
}
