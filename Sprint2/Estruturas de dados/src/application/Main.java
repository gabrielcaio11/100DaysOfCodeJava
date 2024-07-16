package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import entities.Cliente;
import entities.Endereco;
import entities.Pedido;
import entities.Produto;

public class Main {
	private static ArrayList<Cliente> clientes = new ArrayList<>();
	private static ArrayList<Produto> produtosNoEstoque = new ArrayList<>();
	private static HashMap<Cliente,ArrayList<Pedido>> pedidoMap = new HashMap<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		// inicia a aplicacao com usuarios e produtos
		iniciar();
		
		// chama o menu do cliente e retorna um cliente 
		Cliente clienteLogado = menuCliente();
		
		//adiciona produtos que desaja comprar
		ArrayList<Pedido> pedidos = menuPedidos();
		
		//depois de selecionar os produtos que deseja comprar
		//adiciona nos pedidos o cliente e os produtos comprados
		pedidoMap.put(clienteLogado, pedidos);
		
		mostrarProdutosComprados(clienteLogado);
		
	}

	private static void iniciar() {
		produtosNoEstoqueFake();
		clientesFakes();
		
	}

	private static void mostrarProdutosComprados(Cliente clienteLogado) {
		
		List<Pedido> pedidos = pedidoMap.get(clienteLogado);
		
		System.out.println("\n\nPedidos feitos pelo Cliente");
		for(Pedido pedido : pedidos) {
			pedido.mostrarProdutos();
		}
		
	}

	private static void clientesFakes() {
		clientes.add(new Cliente("João Silva", "123.456.789-00", new Endereco("Rua das Flores", 123, "Próximo ao mercado")));
        clientes.add(new Cliente("Maria Oliveira", "987.654.321-00", new Endereco("Avenida Brasil", 456, "Em frente ao parque")));
        clientes.add(new Cliente("Ana Costa", "111.222.333-44", new Endereco("Rua das Palmeiras", 789, "Perto da escola")));

		
	}

	private static void produtosNoEstoqueFake() {
		produtosNoEstoque.add(new Produto("Notebook", "123ABC",2800.0f));
        produtosNoEstoque.add(new Produto("Smartphone", "456DEF",3000.0f));
        produtosNoEstoque.add(new Produto("Tablet", "789GHI",1500.0f));
		
	}

	public static Cliente menuCliente() {
		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Cadastrar novo cliente");
			System.out.println("2. Logar com cliente existente");
			System.out.println("3. Sair");
			System.out.print("Escolha uma opção: ");
			int opcao = scanner.nextInt();
			scanner.nextLine(); // Consumir a nova linha

			switch (opcao) {
			case 1:
				return cadastrarCliente();
			case 2:
				return logarCliente();
			case 3:
				System.out.println("Saindo...");
				return null;
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
		System.out.print("Rua: ");
		String rua = scanner.nextLine();
		System.out.print("Número: ");
		int numero = scanner.nextInt();
		scanner.nextLine(); // Consumir a nova linha
		System.out.print("Ponto de Referência: ");
		String pontoDeReferencia = scanner.nextLine();

		Endereco endereco = new Endereco(rua, numero, pontoDeReferencia);
		Cliente cliente = new Cliente(nome, cpf, endereco);

		if (clientes.add(cliente)) {
			System.out.println("Cliente cadastrado com sucesso!");
		} else {
			System.out.println("Cliente com esse CPF já está cadastrado.");
		}

		return cliente;
	}

	private static Cliente logarCliente() {
		System.out.print("CPF: ");
		String cpf = scanner.nextLine();

		Cliente tempCliente = new Cliente("", cpf, null);
		if (clientes.contains(tempCliente)) {
			System.out.println("Login bem-sucedido!");
			return tempCliente;
		}
		System.out.println("Cliente não encontrado. Tente novamente.");
		return null;
	}

	private static ArrayList<Pedido> menuPedidos() {
		ArrayList<Pedido> pedidos = new ArrayList<>();
		
		System.out.println("\n\nProdutos Disponiveis");
		while (true) {
			// mostra os produtos disponiveis
			for (int i = 1; i <= produtosNoEstoque.size(); i++) {
				System.out.print("[" + i + "]" + produtosNoEstoque.get(i-1) + "\n");
			}

			System.out.println("Digite qual produto quer pelo indice:");
			int indice = scanner.nextInt();
			// verifica se é um indice possivel
			while (!(indice > 0 && indice <= produtosNoEstoque.size())) {
				System.out.println("indice invalido");
				System.out.println("Digite qual produto quer pelo indice:");
				indice = scanner.nextInt();
			}
			System.out.println("Quantidade: ");
			int quantidade = scanner.nextInt();
			
			Pedido pedido = new Pedido();
			pedido.addPedido(produtosNoEstoque.get(indice-1), quantidade);
			pedidos.add(pedido);
			
			System.out.println("Quer continuar ?[s/n]");
			
			String resposta = scanner.next();
			
			if(resposta.equalsIgnoreCase("n")) {
				break;
			}

		}
		return pedidos;

	}
}
