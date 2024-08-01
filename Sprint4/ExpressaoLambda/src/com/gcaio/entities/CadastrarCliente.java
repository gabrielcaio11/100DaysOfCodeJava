package com.gcaio.entities;

import java.util.ArrayList;
import java.util.List;

public class CadastrarCliente {
	private List<Cliente> clientes;

	public CadastrarCliente() {
		this.clientes = new ArrayList<>();
	}

	public void adicionar(Cliente cliente) {
		clientes.add(cliente);
	}

	public List<Cliente> consultar(Filtro<Cliente> filtro) {
		List<Cliente> lista = new ArrayList<>();
		for (Cliente cliente : clientes) {
			if (filtro.avaliar(cliente)) {
				lista.add(cliente);
			}
		}
		return lista;
	}
}
