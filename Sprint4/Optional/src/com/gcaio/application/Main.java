package com.gcaio.application;

import com.gcaio.entities.OperacoesProduto;
import com.gcaio.entities.Produto;
import com.gcaio.exception.ProdutoJaExisteNoEstoque;
import com.gcaio.exception.ProdutoNaoExisteNoEstoque;

public class Main {
	public static void main(String[] args) {
		OperacoesProduto operacoesProduto = new OperacoesProduto();

		Produto p1 = new Produto("Notebook", 10, "ABC123");
		Produto p2 = new Produto("Mouse", 50, "DEF456");
		Produto p3 = new Produto("Teclado", 30, "GHI789");

		try {

			operacoesProduto.adicionarProduto(p1);
			operacoesProduto.adicionarProduto(p2);
			operacoesProduto.adicionarProduto(p3);
			System.out.println("Produtos adicionados com sucesso.");

			// Tentando adicionar um produto com o mesmo código
			// Isso deve lançar ProdutoJaExisteNoEstoque
			operacoesProduto.adicionarProduto(p1); 
		} catch (ProdutoJaExisteNoEstoque e) {
			System.err.println(e.getMessage());
		}

		try {
			
			System.out.println("Todos os produtos: " + operacoesProduto.listarTodos());

			// Obtendo um produto por código
			Produto produtoObtido = operacoesProduto.obterPorCodigo("ABC123")
					.orElseThrow(() -> new ProdutoNaoExisteNoEstoque("Produto com esse codigo nao existe no estoque"));
			System.out.println("Produto obtido: " + produtoObtido);

			// Atualizando um produto
			Produto p1Atualizado = new Produto("Notebook", 8, "ABC123");
			operacoesProduto.atualizarProduto(p1Atualizado);
			System.out.println("Produto atualizado com sucesso.");
			System.out.println("Todos os produtos após atualização: " + operacoesProduto.listarTodos());

			// Removendo um produto
			operacoesProduto.removerProduto("DEF456");
			System.out.println("Produto removido com sucesso.");
			System.out.println("Todos os produtos após remoção: " + operacoesProduto.listarTodos());

			// Tentando remover um produto que não existe
			operacoesProduto.removerProduto("XYZ000"); // Isso deve lançar ProdutoNaoExisteNoEstoque
		} catch (ProdutoNaoExisteNoEstoque e) {
			System.err.println(e.getMessage());
		}
	}
}
