package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Pedido;

public class PedidoDAO {
	private Connection connection;

	public PedidoDAO(Connection connection) {
		this.connection = connection;
	}

	public void createPedido(Pedido pedido) throws SQLException {
		String query = "INSERT INTO pedidos (client_id, product_id, quantidade, valor_total) VALUES ( ?, ?, ?, ?)";
		PreparedStatement pstmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
		pstmt.setInt(1, pedido.getClientId());
		pstmt.setInt(2, pedido.getProductId());
		pstmt.setInt(3, pedido.getQuantidade());
		pstmt.setDouble(4, pedido.getValorTotal());
		pstmt.executeUpdate();
		// Obter o ID gerado
		ResultSet rs = pstmt.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			pedido.setId(id); // Atualizar o ID do pedido
		}
	}

	public List<Pedido> getAllPedidos() throws SQLException {
		List<Pedido> pedidos = new ArrayList<>();
		String query = "SELECT * FROM pedidos";
		PreparedStatement pstmt = connection.prepareStatement(query);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Pedido pedido = new Pedido();
			pedido.setId(rs.getInt("id"));
			pedido.setClientId(rs.getInt("client_id"));
			pedido.setProductId(rs.getInt("product_id"));
			pedido.setQuantidade(rs.getInt("quantidade"));
			pedido.setValorTotal(rs.getDouble("valor_total"));
			pedidos.add(pedido);
		}
		return pedidos;
	}

	public Pedido getPedidoById(int id) throws SQLException {
		String query = "SELECT * FROM pedidos WHERE id = ?";
		PreparedStatement pstmt = connection.prepareStatement(query);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			Pedido pedido = new Pedido();
			pedido.setId(rs.getInt("id"));
			pedido.setClientId(rs.getInt("client_id"));
			pedido.setProductId(rs.getInt("product_id"));
			pedido.setQuantidade(rs.getInt("quantidade"));
			pedido.setValorTotal(rs.getDouble("valor_total"));
			return pedido;
		}
		return null;
	}

	public void updatePedido(Pedido pedido) throws SQLException {
		String query = "UPDATE pedidos SET client_id = ?, product_id = ?, quantidade = ?, valor_total = ? WHERE id = ?";
		PreparedStatement pstmt = connection.prepareStatement(query);
		pstmt.setInt(1, pedido.getClientId());
		pstmt.setInt(2, pedido.getProductId());
		pstmt.setInt(3, pedido.getQuantidade());
		pstmt.setDouble(4, pedido.getValorTotal());
		pstmt.setInt(5, pedido.getId());
		pstmt.executeUpdate();
	}

	public void deletePedido(int id) throws SQLException {
		String query = "DELETE FROM pedidos WHERE id = ?";
		PreparedStatement pstmt = connection.prepareStatement(query);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
	}
}