package application;

import java.util.Scanner;

import entities.Estudante;
import exceptions.CpfInvalidoException;
import exceptions.NomeVazioException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Menu de Login:");
                System.out.println("1. Cadastro Estudante");
                System.out.println("2. Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = Integer.parseInt(scanner.nextLine());

                if (opcao == 1) {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    validarNome(nome);

                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    validarCpf(cpf);

                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    validarMatricula(matricula);

                    Estudante estudante = new Estudante(nome, cpf, matricula);
                    System.out.println("Cadastro realizado com sucesso!");
                    System.out.println("Nome: " + estudante.getNome());
                    System.out.println("CPF: " + estudante.getCpf());
                    System.out.println("Matrícula: " + estudante.getMatricula());
                } else if (opcao == 2) {
                    System.out.println("Saindo...");
                    break;
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
            } catch (NomeVazioException | CpfInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private static void validarNome(String nome) throws NomeVazioException {
        if (nome == null || nome.isEmpty()) {
            throw new NomeVazioException("Nome não pode ser vazio.");
        }
    }

    private static void validarCpf(String cpf) throws CpfInvalidoException {
        if (!cpf.matches("\\d{11}")) {
            throw new CpfInvalidoException("CPF deve ter 11 dígitos.");
        }
    }

    private static void validarMatricula(String matricula) {
        if (matricula == null || matricula.isEmpty()) {
            throw new IllegalArgumentException("Matrícula não pode ser vazia.");
        }
    }
}
