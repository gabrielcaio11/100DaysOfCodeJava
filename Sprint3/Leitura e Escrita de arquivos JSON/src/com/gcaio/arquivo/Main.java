package com.gcaio.arquivo;

import java.util.List;
import java.util.Scanner;

import com.gcaio.projeto.entities.Filme;
import com.gcaio.projeto.entities.FilmeJSON;
import com.gcaio.projeto.entities.Streaming;

public class Main {
	private static List<Filme> filmes;
	private static Scanner scanner = new Scanner(System.in);
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		FilmeJSON filmeJSON = new FilmeJSON();
		filmes = filmeJSON.findAll();
		menuFilme();
		filmeJSON.adicionarFilme(filmes);

	}

	private static void menuFilme() {
		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Adicionar filme");
			System.out.println("2. Listar filmes");
			System.out.println("3. Buscar filme por nome");
			System.out.println("4. Sair");

			System.out.print("Opção: ");
			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				adicionarFilme();
				break;
			case 2:
				listarFilmes();
				break;
			case 3:
				buscarFilmePorNome(scanner);
				break;
			case 4:
				System.out.println("Saindo...");
				return;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}

	}

	private static void adicionarFilme() {

		Filme filme = dadosDoFilme();
		filmes.add(filme);
		System.out.println("Filme adicionado com sucesso!");
	}

	private static Filme dadosDoFilme() {

		System.out.println("Nome do filme: ");
		String nome = scanner.nextLine();

		System.out.println("Autor do filme: ");
		String autor = scanner.nextLine();

		Streaming streaming = pegarStreamingFilme();

		System.out.println("Nota do filme: ");
		double nota = sc.nextDouble();

		Filme filme = new Filme(nome, autor, nota, streaming);
		return filme;
	}

	private static Streaming pegarStreamingFilme() {
		mostrarStreaming();
		System.out.print("Opção: ");
		int opcao = sc.nextInt();
		Streaming streaming = null;
		if (opcao == 0) {
			streaming = Streaming.NETFLIX;
		} else if (opcao == 1) {
			streaming = Streaming.AMAZON_PRIME;
		} else if (opcao == 2) {
			streaming = Streaming.HULU;
		} else if (opcao == 3) {
			streaming = Streaming.DISNEY_PLUS;
		} else if (opcao == 4) {
			streaming = Streaming.HBO_MAX;
		} else if (opcao == 5) {
			streaming = Streaming.APPLE_TV_PLUS;
		} else if (opcao == 6) {
			streaming = Streaming.YOUTUBE_PREMIUM;
		} else if (opcao == 7) {
			streaming = Streaming.PARAMOUNT_PLUS;
		}
		if (opcao == 8) {
			streaming = Streaming.PEACOCK;
		} else {
			streaming = Streaming.OUTRO;
		}
		return streaming;
	}

	private static void mostrarStreaming() {
		System.out.println("Streaming:");
		int cont = 1;
		for (Streaming streaming : Streaming.values()) {
			System.out.println("[" + cont + "]" + streaming + " (" + streaming.getDescricao() + ")");
			cont++;
		}

	}

	private static void listarFilmes() {
		System.out.println("Filmes disponiveis:");
		for (Filme filme : filmes) {
			System.out.println(filme.toString());
		}
	}

	private static void buscarFilmePorNome(Scanner scanner) {
		System.out.print("Nome do filme a buscar: ");
		String nome = scanner.next();

		for (Filme filme : filmes) {
			if (filme.getNome().equalsIgnoreCase(nome)) {
				System.out.println(filme.toString());
			}
		}
	}
}
