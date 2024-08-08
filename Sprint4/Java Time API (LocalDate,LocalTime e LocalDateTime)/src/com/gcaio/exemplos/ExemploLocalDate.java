package com.gcaio.exemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class ExemploLocalDate {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDate natal = LocalDate.of(2024, Month.DECEMBER, 25);
		LocalDate aniversario = LocalDate.parse("2024-07-05");

		System.out.println("Data atual: " + hoje);
		System.out.println("Natal: " + natal);
		System.out.println("Aniversário: " + aniversario);

		LocalDate semanaQueVem = hoje.plusDays(7);
		System.out.println("Daqui a uma semana: " + semanaQueVem);

		boolean isAntes = hoje.isBefore(natal);
		System.out.println("Hoje é antes do Natal? " + isAntes);

		DayOfWeek diaDaSemana = hoje.getDayOfWeek();
		System.out.println("Dia da semana: " + diaDaSemana);

		boolean isBissexto = hoje.isLeapYear();
		System.out.println("Ano bissexto? " + isBissexto);
	}
}
