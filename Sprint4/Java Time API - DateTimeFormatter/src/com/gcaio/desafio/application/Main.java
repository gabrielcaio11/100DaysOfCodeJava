package com.gcaio.desafio.application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.gcaio.desafio.entities.Agenda;
import com.gcaio.desafio.entities.Consulta;
import com.gcaio.desafio.exceptions.AgendaCheiaException;
import com.gcaio.desafio.exceptions.ConflitoDeHorarioException;
import com.gcaio.desafio.exceptions.ForaDoHorarioDeAtendemento;

public class Main {

	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		agendamento();

	}

	private static void agendamento() {
		Agenda agenda = new Agenda();
		int opcao;
		do {
			opcao = obterOpcaoDoUsuario();
			switch (opcao) {
			case 1:
				adicionarConsulta(agenda);
				break;
			case 2:
				imprimirConsultas(agenda);
				break;
			case 3:
				System.out.println("Encerrando o sistema...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (isOpcaoValida(opcao));

	}

	private static boolean isOpcaoValida(int opcao) {
		return opcao > 0 && opcao < 4;
	}

	private static int obterOpcaoDoUsuario() {
		int opcao = -1;
		while (opcao == -1) {
			exibirMenu();
			try {
				opcao = scanner.nextInt();
				scanner.nextLine(); // Limpar o buffer
			} catch (InputMismatchException e) {
				System.out.println("Erro: entrada inválida. Certifique-se de usar o formato de numero inteiro.\n");
				scanner.nextLine(); // Limpar o buffer para evitar loop infinito

			}
		}
		return opcao;
	}

	private static void exibirMenu() {
		System.out.println("\nMenu de Agendamento de Consultas:");
		System.out.println("1. Adicionar consulta");
		System.out.println("2. Imprimir todas as consultas");
		System.out.println("3. Sair");
		System.out.print("\nEscolha uma opção: ");
	}

	private static void adicionarConsulta(Agenda agenda) {
		try {
			System.out.print("Digite o nome do paciente: ");
			String nomePaciente = scanner.nextLine();
			System.out.print("Digite a hora da consulta (HH:mm): ex(10:00) ");
			String horaStr = scanner.nextLine();
			LocalTime dataHora = LocalTime.parse(horaStr, formatter);

			Consulta consulta = new Consulta(nomePaciente, LocalDate.now(), dataHora);
			agenda.adicionarConsulta(consulta);
			System.out.println("Consulta agendada com sucesso!");
		} catch (ForaDoHorarioDeAtendemento e) {
			System.out.println("Erro ao agendar consulta: " + e.getMessage());
		} catch (AgendaCheiaException e) {
			System.out.println("Erro ao agendar consulta: " + e.getMessage());
		} catch (ConflitoDeHorarioException e) {
			System.out.println("Erro ao agendar consulta: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro: entrada inválida. Certifique-se de usar o formato correto para a data e hora.");
		}
	}

	private static void imprimirConsultas(Agenda agenda) {
		agenda.imprimirTodasAsConsultas();
	}
}
