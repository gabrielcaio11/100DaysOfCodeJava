package com.gcaio.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import com.gcaio.entities.Cliente;
import com.gcaio.entities.Pedido;
import com.gcaio.entities.Produto;

public class Main {

	public static void main(String[] args) {

		Cliente cliente = getCliente();
		Pedido pedido = new Pedido(cliente);
		
		pedido.addProduto(getProduto());
		pedido.addProduto(getProduto());
		pedido.addProduto(getProduto());
		pedido.addProduto(getProduto());
		pedido.addProduto(getProduto());
		pedido.addProduto(getProduto());
		
		System.out.println(pedido);
		
		System.out.println("\n\nTodos os produtos:\n");
		pedido.getProdutos().stream().map(Produto::getNome).collect(Collectors.toList()).forEach(System.out::println);
		
		
		System.out.println("\n\nTodos os produtos por preco:\n");
		Map<String, Double> nomePreco = pedido
				.getProdutos()
				.stream()
				.collect(Collectors.toMap(Produto::getNome, Produto::getPreco));
		for (Map.Entry<String, Double> entry : nomePreco.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
	}
	public static Cliente getCliente() {
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente("João da Silva", "joao@example.com"));
		clientes.add(new Cliente("Maria Rodrigues", "maria@example.com"));
		clientes.add(new Cliente("Pedro Oliveira", "pedro@example.com"));
		clientes.add(new Cliente("Ana Souza", "ana@example.com"));
		clientes.add(new Cliente("Luiz Fernandes", "luiz@example.com"));
		clientes.add(new Cliente("Julia Martins", "julia@example.com"));
		clientes.add(new Cliente("Ricardo Costa", "ricardo@example.com"));
		clientes.add(new Cliente("Sandra Lima", "sandra@example.com"));
		clientes.add(new Cliente("Ricardo Costa", "ricardo@example.com"));
		clientes.add(new Cliente("Carlos Dias", "carlos@example.com"));
		Random random = new Random();
        int numeroAleatorio = random.nextInt(clientes.size());
		
		return clientes.get(numeroAleatorio);
	}
	public static Produto getProduto() {
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("Smartphone X", 1500.00));
		produtos.add(new Produto("Notebook Y", 2500.00));
		produtos.add(new Produto("TV 4K Z", 3000.00));
		produtos.add(new Produto("Relógio de Pulso W", 500.00));
		produtos.add(new Produto("Câmera Digital V", 800.00));
		produtos.add(new Produto("Tablet T", 400.00));
		produtos.add(new Produto("Fone de Ouvido U", 200.00));
		produtos.add(new Produto("Impressora 3D S", 1000.00));
		produtos.add(new Produto("Gabinete de Computador R", 150.00));
		produtos.add(new Produto("Software de Edição de Vídeo E", 300.00));
		Random random = new Random();
		int numeroAleatorio = random.nextInt(produtos.size());
		
		return produtos.get(numeroAleatorio);
	}
	
	
	

}
