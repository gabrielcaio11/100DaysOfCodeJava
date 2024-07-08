package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.Gerente;
import entities.Vendedor;

public class Main {
    private static List<Funcionario> funcionarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Gerente");
            System.out.println("2. Adicionar Vendedor");
            System.out.println("3. Calcular Bônus de Funcionários");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    adicionarGerente();
                    break;
                case 2:
                    adicionarVendedor();
                    break;
                case 3:
                    calcularBonus();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    private static void adicionarGerente() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        System.out.print("Bônus Anual: ");
        double bonusAnual = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer

        Gerente gerente = new Gerente(nome, cpf, salario, bonusAnual);
        funcionarios.add(gerente);
        System.out.println("Gerente adicionado com sucesso!");
    }

    private static void adicionarVendedor() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        System.out.print("Comissão: ");
        double comissao = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer

        Vendedor vendedor = new Vendedor(nome, cpf, salario, comissao);
        funcionarios.add(vendedor);
        System.out.println("Vendedor adicionado com sucesso!");
    }

    private static void calcularBonus() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario f : funcionarios) {
                System.out.println("Nome: " + f.getNome());
                System.out.println("CPF: " + f.getCpf());
                System.out.println("Salário: " + f.getSalario());
                System.out.println("Bônus: " + String.format("%.2f", f.calcularBonus()));
                System.out.println();
            }
        }
    }
}

