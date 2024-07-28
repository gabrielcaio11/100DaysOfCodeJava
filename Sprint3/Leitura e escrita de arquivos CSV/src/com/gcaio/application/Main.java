package com.gcaio.application;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.gcaio.csv.FilmeCSV;
import com.gcaio.entities.Filme;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar filme");
            System.out.println("2. Listar todos os filmes");
            System.out.println("3. Buscar filme por título");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    adicionarFilme(scanner);
                    break;
                case 2:
                    listarFilmes();
                    break;
                case 3:
                    buscarFilmePorTitulo(scanner);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void adicionarFilme(Scanner scanner) {
        System.out.print("Digite o nome do filme: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o ano de lançamento: ");
        int anoLancamento = scanner.nextInt();

        System.out.print("Digite a nota: ");
        double nota = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha

        Filme filme = new Filme(nome, anoLancamento, nota);
        try {
            FilmeCSV.adicionarFilme(filme);
            System.out.println("Filme adicionado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao adicionar o filme: " + e.getMessage());
        }
    }

    private static void listarFilmes() {
        List<Filme> filmes = FilmeCSV.listarFilmes();
        if (filmes == null || filmes.isEmpty()) {
            System.out.println("Nenhum filme encontrado.");
        } else {
            System.out.println("Lista de filmes:");
            for (Filme filme : filmes) {
                System.out.println(filme);
            }
        }
    }

    private static void buscarFilmePorTitulo(Scanner scanner) {
        System.out.print("Digite o título do filme: ");
        String titulo = scanner.nextLine();

        Filme filme = FilmeCSV.buscarFilmePorTitulo(titulo);
        if (filme != null) {
            System.out.println("Filme encontrado: " + filme);
        } else {
            System.out.println("Filme não encontrado.");
        }
    }
}
