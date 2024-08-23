package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Client;

public class ClientDAO {
	private Connection connection;

	public ClientDAO(Connection connection) {
		this.connection = connection;
	}

	public void createClient(Client client) throws SQLException {
		String query = "INSERT INTO clients (name, email) VALUES (?, ?)";
		PreparedStatement pstmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

		pstmt.setString(1, client.getName());
		pstmt.setString(2, client.getEmail());
		pstmt.executeUpdate();
		// Obter o ID gerado
		ResultSet rs = pstmt.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			client.setId(id); // Atualizar o ID do cliente
		}
	}

	public List<Client> getAllClients() throws SQLException {
		List<Client> clients = new ArrayList<>();
		String query = "SELECT * FROM clients";
		PreparedStatement pstmt = connection.prepareStatement(query);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Client client = new Client();
			client.setId(rs.getInt("id"));
			client.setName(rs.getString("name"));
			client.setEmail(rs.getString("email"));
			clients.add(client);
		}
		return clients;
	}

	public Client getClientById(int id) throws SQLException {
		String query = "SELECT * FROM clients WHERE id = ?";
		PreparedStatement pstmt = connection.prepareStatement(query);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		Client client = new Client();
		if (rs.next()) {

			client.setId(rs.getInt("id"));
			client.setName(rs.getString("name"));
			client.setEmail(rs.getString("email"));
			return client;
		}
		return client;
	}

	public void updateClient(Client client) throws SQLException {
		String query = "UPDATE clients SET name = ?, email = ? WHERE id = ?";
		PreparedStatement pstmt = connection.prepareStatement(query);
		pstmt.setString(1, client.getName());
		pstmt.setString(2, client.getEmail());
		pstmt.setInt(3, client.getId());
		pstmt.executeUpdate();
	}

	public void deleteClient(int id) throws SQLException {
		String query = "DELETE FROM clients WHERE id = ?";
		PreparedStatement pstmt = connection.prepareStatement(query);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
	}
}