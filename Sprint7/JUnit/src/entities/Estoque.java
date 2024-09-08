package entities;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void removerProduto(int id) {
        Produto produtoParaRemover = buscarProdutoPorId(id);
        if (produtoParaRemover != null) {
            produtos.remove(produtoParaRemover);
        } else {
            throw new IllegalArgumentException("Produto não encontrado no estoque.");
        }
    }

    public Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void exibirProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

	public List<Produto> getProdutos() {
		return produtos;
	}
}
