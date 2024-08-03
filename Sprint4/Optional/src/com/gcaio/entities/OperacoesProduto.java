package com.gcaio.entities;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import com.gcaio.exception.ProdutoJaExisteNoEstoque;
import com.gcaio.exception.ProdutoNaoExisteNoEstoque;

public class OperacoesProduto {
	private Set<Produto> produtos;

	public OperacoesProduto() {
		this.produtos = new HashSet<>();
	}

	/** Método para adicionar um produto */
		public void adicionarProduto(Produto produto) {
		if (obterPorCodigo(produto.getCodigo()).isPresent()) {
			throw new ProdutoJaExisteNoEstoque("Produto com o mesmo codigo ja existe no estoque");
		}
		produtos.add(produto);

	}

	/** Método para remover um produto pelo código */
	public void removerProduto(String codigo) throws ProdutoNaoExisteNoEstoque {
		obterPorCodigo(codigo)
				.orElseThrow(() -> new ProdutoNaoExisteNoEstoque("Produto com esse codigo nao existe no estoque"));
		produtos.remove(obterPorCodigo(codigo).get());
	}

	/** Método para obter um produto pelo código */
	public Optional<Produto> obterPorCodigo(String codigo) {
		return produtos.stream().filter(produto -> produto.getCodigo().equals(codigo)).findFirst();
	}

	/** Método para atualizar um produto */
	public void atualizarProduto(Produto produtoAtualizado) throws ProdutoNaoExisteNoEstoque {

		obterPorCodigo(produtoAtualizado.getCodigo())
				.orElseThrow(() -> new ProdutoNaoExisteNoEstoque("Produto com esse codigo nao existe no estoque"));

		Produto prod = obterPorCodigo(produtoAtualizado.getCodigo()).get();
		prod.setNome(produtoAtualizado.getNome());
		prod.setQuantidade(produtoAtualizado.getQuantidade());
		// não precisa atualizar o codigo já que é o mesmo
		// caso queira mudar o codigo adicione ou o codigo antigo ou
		// o produto antigo no parametro

	}

	/**
	 * Método para listar todos os produtos
	 */
	public Set<Produto> listarTodos() {
		return produtos;
	}

}
