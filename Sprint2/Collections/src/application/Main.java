package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Livro;

public class Main {
	private static Set<Livro> livros = new HashSet<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		iniciarListaLivros();

		while (true) {
			System.out.println("Menu de Biblioteca");
			System.out.println("1. Listar Livros");
			System.out.println("2. Pegar Livro Emprestado");
			System.out.println("3. Devolver Livro");
			System.out.println("4. Sair");

			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				listarLivros();
				break;
			case 2:
				pegarLivroEmprestado();
				break;
			case 3:
				devolverLivro();
				break;
			case 4:
				System.out.println("Saindo...");
				return;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}

	private static void iniciarListaLivros() {
		livros.add(new Livro("Livro 1", "Autor 1", 2000, 200, "Editora 1", 100));
		livros.add(new Livro("Livro 2", "Autor 2", 2001, 300, "Editora 2", 200));
		livros.add(new Livro("Livro 3", "Autor 3", 2002, 400, "Editora 3", 300));

	}

	private static void listarLivros() {
		System.out.println("Livros Cadastrados:");
		for (Livro livro : livros) {
			System.out.println(livro.toString());
		}
	}

	private static void pegarLivroEmprestado() {
		System.out.println("Pegar Livro Emprestado");
		System.out.print("Titulo do Livro: ");
		String titulo = scanner.next();

		for (Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.getQuantidade() > 1) {
				livro.setQuantidade(livro.getQuantidade() - 1);
				System.out.println("Livro disponivel para emprestimo!");
				return;
			}
		}
		System.out.println("Livro indisponivel para emprestimo!");

	}

	private static void devolverLivro() {

		System.out.println("Devolver Livro");
		System.out.print("Titulo do Livro: ");
		String titulo = scanner.next();

		for (Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(titulo)) {
				livro.setQuantidade(livro.getQuantidade() - 1);
				System.out.println("Livro devolvido com sucesso!");
				return;
			}
		}
		System.out.println("Livro não encontrado.");
	}
}