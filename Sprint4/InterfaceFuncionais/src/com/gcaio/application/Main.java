package com.gcaio.application;

import java.util.List;

import com.gcaio.entities.CadastrarCliente;
import com.gcaio.entities.Cliente;
import com.gcaio.entities.Filtro;

public class Main {

	public static void main(String[] args) {
		CadastrarCliente clientes = new CadastrarCliente();
        clientes.adicionar(new Cliente("João da Silva", 30));
        clientes.adicionar(new Cliente("Maria Rodrigues", 25));
        clientes.adicionar(new Cliente("Pedro Henrique", 40));
        clientes.adicionar(new Cliente("Ana Luiza", 28));
        clientes.adicionar(new Cliente("Luís Fernando", 35));
        clientes.adicionar(new Cliente("Juliana Martins", 22));
        clientes.adicionar(new Cliente("Ricardo Oliveira", 45));
        clientes.adicionar(new Cliente("Gabriela Souza", 32));
        clientes.adicionar(new Cliente("Carlos Alberto", 38));
        clientes.adicionar(new Cliente("Beatriz Costa", 29));
        
        // Filtro que retorna clientes com idade maior que 30
        Filtro<Cliente> filtroIdade = cliente -> cliente.getIdade() > 30;

        List<Cliente> clientesFiltrados = clientes.consultar(filtroIdade);
        
        clientesFiltrados.forEach(System.out::println);


	}

}
