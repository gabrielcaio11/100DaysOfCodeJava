package application;

import java.util.Scanner;

import entities.Cliente;
import entities.Fila;

public class Atendimento {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a capacidade da fila: ");
        int capacidade = scanner.nextInt();
        scanner.nextLine();  // Consome a nova linha

        Fila fila = new Fila(capacidade);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Remover Cliente");
            System.out.println("3. Exibir Todos os Clientes");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consome a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o CPF do cliente: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite o CEP do cliente: ");
                    String cep = scanner.nextLine();
                    Cliente cliente = new Cliente(nome, cpf, cep);
                    fila.adicionarCliente(cliente);
                    break;
                case 2:
                    fila.removerCliente();
                    break;
                case 3:
                    fila.exibirTodosClientes();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

}
