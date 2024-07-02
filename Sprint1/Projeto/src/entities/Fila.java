package entities;

public class Fila {

	private Cliente[] clientes;
	private int tamanho;

	// Construtor
	public Fila(int capacidade) {
		clientes = new Cliente[capacidade];
		tamanho = 0;
	}

	// Método para adicionar um cliente à fila
	public void adicionarCliente(Cliente cliente) {
		if (tamanho < clientes.length) {
			clientes[tamanho] = cliente;
			tamanho++;
		} else {
			System.out.println("A fila está cheia!");
		}
	}

	// Método para remover um cliente da fila
	public Cliente removerCliente() {
		if (tamanho == 0) {
			System.out.println("A fila está vazia!");
			return null;
		} else {
			Cliente clienteRemovido = clientes[0];
			// Shiftar os elementos para a esquerda
			for (int i = 1; i < tamanho; i++) {
				clientes[i - 1] = clientes[i];
			}
			clientes[tamanho - 1] = null;
			tamanho--;
			return clienteRemovido;
		}
	}

	// Método para exibir todos os clientes da fila
	public void exibirTodosClientes() {
		if (tamanho == 0) {
			System.out.println("A fila está vazia!");
		} else {
			System.out.println("Clientes na fila:");
			for (int i = 0; i < tamanho; i++) {
				System.out.println((i + 1) + ". " + clientes[i].getNome() + " - CPF: " + clientes[i].getCpf()
						+ " - CEP: " + clientes[i].getCep());
			}
		}
	}

}
