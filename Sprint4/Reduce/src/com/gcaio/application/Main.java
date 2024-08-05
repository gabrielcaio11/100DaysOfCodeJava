package com.gcaio.application;

import java.util.List;

import com.gcaio.entities.Produto;

public class Main {

	public static void main(String[] args) {
		List<Produto> produtos = Produto.criarExemplos();

		for (Produto produto : produtos) {
			System.out.println(produto.toString());
		}
		System.out.println("\n\n");

		Integer quantidadeNoEstoque = produtos
				.stream()
				.map(Produto::getQuantidade)
				.reduce(0, Integer::sum);
		
		System.out.println(quantidadeNoEstoque + " produtos no estoque");
		
		double mediaPreco = produtos
				.stream()
				.mapToDouble(Produto::getPreco)
				.average()
				.orElseThrow(() -> new RuntimeException("Não a produtos no estoque para calcular a media"));

		System.out.println("A media dos preços de produtos no estoque é " + mediaPreco);
		
		long quantidadeProdutosComEstoqueSuficiente = produtos
				.stream()
				.filter(produto -> produto.getQuantidade() > 0)
				.count();
		
		System.out.println("No estoque temos " + quantidadeProdutosComEstoqueSuficiente
				+" produtos com quantidade suficiente (maior que zero)");
		
		double precoTotal = produtos.stream()
                .map(Produto::getPreco)
                .reduce(0.0, Double::sum);
		
		System.out.println("No estoque temos uum valor total de R$ " 
				+ String.format("%.2f",precoTotal) + " reais");


	}

}
