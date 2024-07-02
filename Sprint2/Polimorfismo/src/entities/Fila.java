package entities;

public class Fila {
    private Cliente[] clientes;
    private int tamanho;

    public Fila(int capacidade) {
        clientes = new Cliente[capacidade];
        tamanho = 0;
    }

    public void adicionarCliente(Cliente cliente) {
        if (tamanho < clientes.length) {
            clientes[tamanho] = cliente;
            tamanho++;
            System.out.println("Cliente adicionado à fila.");
        } else {
            System.out.println("A fila está cheia!");
        }
    }

    public Cliente removerCliente() {
        if (tamanho == 0) {
            System.out.println("A fila está vazia!");
            return null;
        } else {
            Cliente clienteRemovido = clientes[0];
            for (int i = 1; i < tamanho; i++) {
                clientes[i - 1] = clientes[i];
            }
            clientes[tamanho - 1] = null;
            tamanho--;
            System.out.println("Cliente removido da fila: " + clienteRemovido.getNome());
            return clienteRemovido;
        }
    }

    public void exibirTodosClientes() {
        if (tamanho == 0) {
            System.out.println("A fila está vazia!");
        } else {
            System.out.println("Clientes na fila:");
            for (int i = 0; i < tamanho; i++) {
                System.out.println((i + 1) + ". " + clientes[i].getNome() + " - CPF: " + clientes[i].getCpf() + " - CEP: " + clientes[i].getCep() + " - Tipo de Cliente: " + clientes[i].getTipoCliente());
            }
        }
    }

}
