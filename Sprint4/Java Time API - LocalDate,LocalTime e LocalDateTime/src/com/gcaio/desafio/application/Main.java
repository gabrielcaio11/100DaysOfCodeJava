package com.gcaio.desafio.application;

import com.gcaio.desafio.entities.Consulta;
import com.gcaio.desafio.entities.Agenda;
import com.gcaio.desafio.exceptions.AgendaCheiaException;
import com.gcaio.desafio.exceptions.ConflitoDeHorarioException;
import com.gcaio.desafio.exceptions.ForaDoHorarioDeAtendemento;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Consulta consulta1 = new Consulta("Consulta 1", LocalDate.now(), LocalTime.of(9, 0));
        Consulta consulta2 = new Consulta("Consulta 2", LocalDate.now(), LocalTime.of(10, 30));
        Consulta consulta3 = new Consulta("Consulta 3", LocalDate.now(), LocalTime.of(9, 0));

        try {
            agenda.adicionarConsulta(consulta1);
            agenda.adicionarConsulta(consulta2);
            agenda.adicionarConsulta(consulta3);
        } catch (ForaDoHorarioDeAtendemento | AgendaCheiaException | ConflitoDeHorarioException e) {
            System.err.println(e.getMessage());
        }

        agenda.imprimirTodasAsConsultas();
    }
}
