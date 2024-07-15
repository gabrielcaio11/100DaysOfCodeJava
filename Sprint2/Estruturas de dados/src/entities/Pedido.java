package entities;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produto> produtos = new ArrayList<>();
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

