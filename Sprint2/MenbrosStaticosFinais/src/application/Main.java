package application;

import java.util.Scanner;

import entities.Estudante;
import entities.SalaDeAula;

public class Main {
    private static SalaDeAula salaDeAula = new SalaDeAula();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean sair = false;
        while (!sair) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Remover Aluno");
            System.out.println("3. Listar Alunos");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer após ler o número

            switch (escolha) {
                case 1:
                    adicionarAluno();
                    break;
                case 2:
                    removerAluno();
                    break;
                case 3:
                    listarAlunos();
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }

    private static void adicionarAluno() {
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Idade do aluno: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer após ler a idade
        System.out.print("Matrícula do aluno: ");
        String matricula = scanner.nextLine();

        Estudante aluno = new Estudante(nome, idade, matricula);
        salaDeAula.adicionarAluno(aluno);
    }

    private static void removerAluno() {
        System.out.print("Nome do aluno a remover: ");
        String nome = scanner.nextLine();

        Estudante alunoARemover = null;
        for (Estudante aluno : salaDeAula.getAlunos()) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                alunoARemover = aluno;
                break;
            }
        }

        if (alunoARemover != null) {
            salaDeAula.removerAluno(alunoARemover);
        } else {
            System.out.println("Aluno não encontrado na sala de aula.");
        }
    }

    private static void listarAlunos() {
        System.out.println("\nLista de Alunos:");
        for (Estudante aluno : salaDeAula.getAlunos()) {
            System.out.println(aluno);
        }
    }
}

