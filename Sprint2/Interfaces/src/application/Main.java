package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Boleto;
import entities.CartaoCredito;
import entities.Cliente;
import entities.Pagamento;

public class Main {
	private static List<Cliente> clientes = new ArrayList<>();
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		menuPrincipal();
		scanner.close();
	}

	private static void menuPrincipal() {
		boolean sair = false;
		while (!sair) {
			System.out.println("Menu Principal:");
			System.out.println("1. Cadastrar Cliente");
			System.out.println("2. Login");
			System.out.println("3. Sair");
			int escolha = scanner.nextInt();
			scanner.nextLine(); // Limpa o buffer
			Cliente cliente;
			switch (escolha) {
			case 1:
				cliente = cadastrarCliente();
				menuPagamento(cliente);
				sair = true;
				break;
			case 2:
				cliente = fazerLogin();
				if (cliente != null) {
					menuPagamento(cliente);
				}
				sair = true;
				break;
			case 3:
				sair = true;
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}

	}

	private static Cliente cadastrarCliente() {
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("CPF: ");
		String cpf = scanner.nextLine();
		System.out.print("Senha: ");
		String senha = scanner.nextLine();
		System.out.print("Saldo Inicial: ");
		double saldoInicial = scanner.nextDouble();
		scanner.nextLine(); // Limpa o buffer

		Cliente cliente = new Cliente(nome, cpf, senha, saldoInicial);
		clientes.add(cliente);
		System.out.println("Cliente cadastrado com sucesso!");
		
		return cliente;
	}

	private static Cliente fazerLogin() {
		System.out.print("CPF: ");
		String cpf = scanner.nextLine();
		System.out.print("Senha: ");
		String senha = scanner.nextLine();

		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equals(cpf) && cliente.getSenha().equals(senha)) {
				System.out.println("Login realizado com sucesso!");
				System.out.println("Bem-vindo, " + cliente.getNome() + "!");
				System.out.println(cliente);
				return cliente;
			}
		}
		System.out.println("CPF ou senha incorretos. Tente novamente.");
		return null;
	}

	private static void menuPagamento(Cliente cliente) {
		Pagamento pagamento = null;
		if(cliente.getSaldo() == 0) {
			System.out.println("Saldo insuficiente!");
			return;
		}
		System.out.println("Escolha o método de pagamento:");
		System.out.println("1. Cartão de Crédito");
		System.out.println("2. Boleto Bancário");
		int escolha = scanner.nextInt();
		scanner.nextLine(); // Limpa o buffer

		switch (escolha) {
		case 1:

			System.out.print("Número do Cartão: ");
			String numeroCartao = scanner.nextLine();

			System.out.print("Nome do Titular: ");
			String titular = scanner.nextLine();

			System.out.print("Valor: ");
			double valorCartao = scanner.nextDouble();
			
			if(!verificarSaldoSuficiente(cliente,valorCartao)) {
				return;
			}
			scanner.nextLine(); // Limpa o buffer

			pagamento = new CartaoCredito(numeroCartao, titular, valorCartao);
			break;

		case 2:
			System.out.print("Código de Barras: ");
			String codigoBarras = scanner.nextLine();

			System.out.print("Valor: ");
			double valorBoleto = scanner.nextDouble();
			scanner.nextLine(); // Limpa o buffer
			if(!verificarSaldoSuficiente(cliente,valorBoleto)) {
				return;
			}
			pagamento = new Boleto(codigoBarras, valorBoleto);
			break;

		default:
			System.out.println("Método de pagamento inválido.");
			return;
		}

		// Autenticar o cliente antes de autorizar e processar o pagamento
		System.out.print("Digite a senha para autorizar o pagamento: ");
		String senhaPagamento = scanner.nextLine();

		pagamento.autorizar(cliente, senhaPagamento);
		pagamento.processar();
	}
	/**
	 * verifica se o cliente logado tem saldo suficiente para pagar/sacar
	 * 
	 * retorna false se não tiver saldo suficiente ou
	 * retorna true se tiver saldo suficiente.
	 * */
	private static boolean verificarSaldoSuficiente(Cliente cliente, double valor) {
		if(valor>cliente.getSaldo()) {
			System.out.println("Saldo insuficiente!");
			return false;
		}
		return true;
		
	}
}
