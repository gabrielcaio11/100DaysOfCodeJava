package application;

import entities.ListaGerenciador;
import entities.Produto;

public class Main {
    public static void main(String[] args) {
    	
        // Gerenciador de Livros
        ListaGerenciador<String> gerenciadorLivros = new ListaGerenciador<>();
        gerenciadorLivros.adicionarItem("O Senhor dos Anéis");
        gerenciadorLivros.adicionarItem("O Hobbit");
        gerenciadorLivros.adicionarItem("Harry Potter");
        System.out.println("Livros:");
        gerenciadorLivros.exibirItens();
        System.out.println();
        gerenciadorLivros.removerItem("Harry Potter");
        System.out.println("Livros atualizados:");
        gerenciadorLivros.exibirItens();
        System.out.println();

        // Gerenciador de Números
        
        ListaGerenciador<Integer> gerenciadorNumeros = new ListaGerenciador<>();
        gerenciadorNumeros.adicionarItem(10);
        gerenciadorNumeros.adicionarItem(20);
        gerenciadorNumeros.adicionarItem(30);
        System.out.println("Números:");
        gerenciadorNumeros.exibirItens();
        System.out.println();
        gerenciadorNumeros.removerItem(10);
        System.out.println("Números atualizados:");
        gerenciadorNumeros.exibirItens();
        System.out.println();

        // Gerenciador de Produtos

        ListaGerenciador<Produto> gerenciadorProdutos = new ListaGerenciador<>();
        gerenciadorProdutos.adicionarItem(new Produto("Notebook", 101));
        gerenciadorProdutos.adicionarItem(new Produto("Celular", 102));
        gerenciadorProdutos.adicionarItem(new Produto("Tablet", 103));
        System.out.println("Produtos:");
        gerenciadorProdutos.exibirItens();
        gerenciadorProdutos.removerItem(new Produto("Notebook", 101));
        System.out.println();
        System.out.println("Produtos atualizados:");
        gerenciadorProdutos.exibirItens();
    }
}

