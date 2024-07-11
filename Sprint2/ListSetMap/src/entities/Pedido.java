package entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> produtos = new ArrayList<>();
    private int quantidade;
    
    public void addPedido(Produto produto, int quantidade) {
        produtos.add(produto);
        this.quantidade = quantidade;
    }

    public void mostrarProdutos() {
    	System.out.print("Quantidade: " + quantidade + " - ");
        for(Produto prod : produtos) {
        	System.out.println(prod.toString());
        }
    }
}

