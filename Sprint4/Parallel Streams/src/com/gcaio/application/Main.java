package com.gcaio.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.gcaio.entities.Produto;

public class Main {

	 public static void main(String[] args) {
	        List<Produto> produtos = Arrays.asList(
	            new Produto("Produto1", 10, "001"),
	            new Produto("Produto2", 0, "002"),
	            new Produto("Produto3", 5, "003"),
	            new Produto("Produto4", 3, "004"),
	            new Produto("Produto5", 7, "005")
	        );

	        // Filtrar produtos em estoque e calcular a soma das quantidades usando Parallel Streams
	        int quantidadeTotal = produtos.parallelStream()
	                                      .filter(produto -> produto.getQuantidade() > 0)
	                                      .mapToInt(Produto::getQuantidade)
	                                      .sum();
	        System.out.println("Quantidade total em estoque usando Parallel Streams: " + quantidadeTotal);
	        
	        // Filtrar e coletar os produtos em estoque usando Parallel Streams
	        List<Produto> produtosEmEstoque = produtos.parallelStream()
	                                                  .filter(produto -> produto.getQuantidade() > 0)
	                                                  .collect(Collectors.toList());
	        System.out.println("Produtos em estoque usando Parallel Streams: " + produtosEmEstoque);
	    }

	}


