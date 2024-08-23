package entities;

import java.sql.SQLException;

import dao.ClientDAO;
import dao.ProductDAO;

public class Pedido {
	private int id;
	private int clientId;
	private int productId;
	private int quantidade;
	private double valorTotal;
	
	public Pedido(int clientId, int productId, int quantidade, double valorTotal) {
		this.clientId = clientId;
		this.productId = productId;
		this.quantidade = quantidade;
		this.valorTotal = valorTotal;
	}

	public Pedido() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	

}
